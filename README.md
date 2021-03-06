<img src="./app/play_icon.png" alt="InstaGrabber" align="right" width="25%"/>

## InstaGrabber

InstaGrabber is an app that allows...

* Viewing **and downloading** Instagram posts (including tagged, and your own saved posts\*), stories (including highlights)\*, DM\*, and profile pictures, **without** letting people know you viewed it<sup>1</sup>! Works for followed private accounts\*!
* Like/bookmark posts\*!
* Downloading multiple posts at once (hold & select)!
* (Un)follow/restrict/block people\*, and (un)follow hashtags\*! (Or you can add shortcuts to them, without logging in!)
* **View, copy, like\*, reply\*, & delete\*** comments!
* **Copy** post captions, DM messages\*, and profile bios.
* **Compare** follower/following list<sup>2</sup>!
* Searching usernames and hashtags.

<sub>* Requires [login](#how-to-log-in). You must be a current follower of the desired private accounts, this app cannot hack people (which I have to state despite the obvious)!</sub>

It can be used as a drop-in replacement for read functionalities of the official Instagram app, with unnecessary components stripped.

<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/1.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/1.jpg" alt="Profile" width="15%"/></a>
<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/2.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/2.jpg" alt="Post" width="15%"/></a>
<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/3.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/3.jpg" alt="Comments" width="15%"/></a>
<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/4.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/4.jpg" alt="Story (Highlight shown)" width="15%"/></a>
<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/5.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/5.jpg" alt="Hashtag" width="15%"/></a>
<a href="https://github.com/austinhuang0131/instagrabber/blob/master/fastlane/metadata/android/images/phoneScreenshots/6.jpg"><img src="./fastlane/metadata/android/images/phoneScreenshots/6.jpg" alt="Location" width="15%"/></a>

This app is originally made by [@AwaisKing](https://github.com/AwaisKing) who posted on [GitLab](https://gitlab.com/AwaisKing/instagrabber) but subsequently abandoned it. I decided to continue the app cuz why not, ~~even though it might not be that *cash money*.~~ (Also I need to learn Java.)

### Download

Download [here](https://github.com/austinhuang0131/instagrabber/releases). Under each release is an `app-release.apk` for installation.

Not compatible with pre-16.6 versions (including alpha).

[F-droid pending.](https://gitlab.com/fdroid/rfp/-/issues/1432)

Remember to read the [wiki](https://github.com/austinhuang0131/instagrabber/wiki) for more info!

[![Open Source Love svg3](https://badges.frapsoft.com/os/v3/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](http://makeapullrequest.com)
[![GPLv3 license](https://img.shields.io/badge/License-GPLv3-blue.svg)](./LICENSE)
[![Snyk Vulnerabilities](https://img.shields.io/snyk/vulnerabilities/github/austinhuang0131/instagrabber)](https://snyk.io/test/github/austinhuang0131/instagrabber)
[![LGTM Alerts](https://img.shields.io/lgtm/alerts/github/austinhuang0131/instagrabber)](https://lgtm.com/projects/g/austinhuang0131/instagrabber)
[![LGTM Grade](https://img.shields.io/lgtm/grade/java/github/austinhuang0131/instagrabber)](https://lgtm.com/projects/g/austinhuang0131/instagrabber)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f87cac1fbf674888b00bd91bc5eccce0)](https://app.codacy.com/manual/austinhuang0131/instagrabber)
[![Crowdin](https://badges.crowdin.net/instagrabber/localized.svg)](https://github.com/austinhuang0131/instagrabber/wiki/Contribute)
[![GitHub stars](https://img.shields.io/github/stars/austinhuang0131/instagrabber.svg?style=social&label=Star&maxAge=2592000)](https://GitHub.com/austinhuang0131/instagrabber/stargazers/)

### How to log in

By logging in, you can access posts/stories from private accounts, as well as your direct messages.

The relevant source code is [here](https://github.com/austinhuang0131/instagrabber/blob/master/app/src/main/java/awais/instagrabber/activities/Login.java) should you be concerned.

1. Click the 3 dots on the bottom right corner.
2. Click "Settings".
3. Scroll down, click the green button called "Login".
4. Login as usual. Use "Refresh" when needed.
5. When you see your feed page, click "Get cookies".
6. Test it by checking your direct messages. If it loads, it works!

### Contact us

* Use [GitHub issues](https://github.com/austinhuang0131/instagrabber/issues) when possible.
* Matrix: [#InstaGrabber:matrix.org](https://matrix.to/#/#instagrabber:matrix.org)
* Telegram: [@Grabber_App](https://t.me/grabber_app)

[![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com)[![forthebadge](https://forthebadge.com/images/badges/built-for-android.svg)](https://forthebadge.com)
[![Crowdin | Agile localization for tech companies](https://badges.crowdin.net/badge/dark/crowdin-on-light.png)](https://crowdin.com/?utm_source=badge&utm_medium=referral&utm_campaign=badge-add-on)

<sub>Previous owner left a lot of swearings in the code, I will remove them when I get to that file.</sub>

<sub>1. The downside is that they'll always be "new" in other Instagram clients. Also, this app will not respect DM message restrictions (replay once / no replay).<br>2. Shameless plug: If you do not have an Android device but wants to do that, read [this](https://austinhuang.me/instagram-compare).</sub>
