package awais.instagrabber.asyncs;

import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

import awais.instagrabber.BuildConfig;
import awais.instagrabber.interfaces.FetchListener;
import awais.instagrabber.models.LocationModel;
import awais.instagrabber.utils.Constants;
import awais.instagrabber.utils.Utils;
import awaisomereport.LogCollector;

import static awais.instagrabber.utils.Utils.logCollector;

public final class LocationFetcher extends AsyncTask<Void, Void, LocationModel> {
    private final FetchListener<LocationModel> fetchListener;
    private final String idSlug;

    public LocationFetcher(String idSlug, FetchListener<LocationModel> fetchListener) {
        // idSlug = id + "/" + slug
        this.idSlug = idSlug;
        this.fetchListener = fetchListener;
    }

    @Nullable
    @Override
    protected LocationModel doInBackground(final Void... voids) {
        LocationModel result = null;

        try {
            final HttpURLConnection conn = (HttpURLConnection) new URL("https://www.instagram.com/explore/locations/" + idSlug + "/?__a=1").openConnection();
            conn.setUseCaches(true);
            conn.connect();

            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                final JSONObject user = new JSONObject(Utils.readFromConnection(conn)).getJSONObject("graphql").getJSONObject(Constants.EXTRAS_LOCATION);

                final JSONObject timelineMedia = user.getJSONObject("edge_location_to_media");
                if (timelineMedia.has("edges")) {
                    final JSONArray edges = timelineMedia.getJSONArray("edges");
                }

                result = new LocationModel(
                        user.getString(Constants.EXTRAS_ID) + "/" + user.getString("slug"),
                        user.getString("name"),
                        user.getString("blurb"),
                        user.getString("website"),
                        user.getString("profile_pic_url"),
                        timelineMedia.getLong("count"),
                        BigDecimal.valueOf(user.optDouble("lat", 0d)).toString(),
                        BigDecimal.valueOf(user.optDouble("lng", 0d)).toString()
                );
            }

            conn.disconnect();
        } catch (final Exception e) {
            if (logCollector != null)
                logCollector.appendException(e, LogCollector.LogFile.ASYNC_LOCATION_FETCHER, "doInBackground");
            if (BuildConfig.DEBUG) Log.e("AWAISKING_APP", "", e);
        }

        return result;
    }

    @Override
    protected void onPostExecute(final LocationModel result) {
        if (fetchListener != null) fetchListener.onResult(result);
    }
}
