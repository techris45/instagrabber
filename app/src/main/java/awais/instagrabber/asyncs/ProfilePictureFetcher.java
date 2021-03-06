package awais.instagrabber.asyncs;

import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;

import awais.instagrabber.BuildConfig;
import awais.instagrabber.interfaces.FetchListener;
import awais.instagrabber.utils.Constants;
import awais.instagrabber.utils.Utils;
import awaisomereport.LogCollector;

import static awais.instagrabber.utils.Utils.logCollector;

public final class ProfilePictureFetcher extends AsyncTask<Void, Void, String> {
    private final FetchListener<String> fetchListener;
    private final String userName, userId, picUrl;
    private final boolean isHashtag;

    public ProfilePictureFetcher(final String userName, final String userId, final FetchListener<String> fetchListener,
                                 final String picUrl, final boolean isHashtag) {
        this.fetchListener = fetchListener;
        this.userName = userName;
        this.userId = userId;
        this.picUrl = picUrl;
        this.isHashtag = isHashtag;
    }

    @Override
    protected String doInBackground(final Void... voids) {
        String out = picUrl;
        if (!isHashtag) try {
            final String url = "https://i.instagram.com/api/v1/users/"+userId+"/info/";

            final HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setUseCaches(false);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", Constants.USER_AGENT);

            final String result = conn.getResponseCode() == HttpURLConnection.HTTP_OK ? Utils.readFromConnection(conn) : null;
            conn.disconnect();

            if (!Utils.isEmpty(result)) {
                JSONObject data = new JSONObject(result).getJSONObject("user");
                if (data.has("hd_profile_pic_url_info"))
                    out = data.getJSONObject("hd_profile_pic_url_info").optString("url");
            }
        } catch (final Exception e) {
            if (logCollector != null)
                logCollector.appendException(e, LogCollector.LogFile.ASYNC_PROFILE_PICTURE_FETCHER, "doInBackground");
            if (BuildConfig.DEBUG) Log.e("AWAISKING_APP", "", e);
        }

        if (out == null) out = picUrl;
        return out;
    }

    @Override
    protected void onPreExecute() {
        if (fetchListener != null) fetchListener.doBefore();
    }

    @Override
    protected void onPostExecute(final String result) {
        if (fetchListener != null) fetchListener.onResult(result);
    }
}