package com.loopme.customparser;

public class DataSource {

    private static final String DATA =
            "<VAST version=\"3.0\">\n" +
                    "<Ad id=\"9195\">\n" +
                    "<InLine>\n" +
                    "<AdSystem version=\"1.3.721\">LoopMe LTD</AdSystem>\n" +
                    "<Error>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=ERROR&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI&vastcode=[ERRORCODE]\n" +
                    "]]>\n" +
                    "</Error>\n" +
                    "<Impression>\n" +
                    "<![CDATA[\n" +
                    "https://fqtag.com/pixel.cgi?s=6626b8ab9ce38796d32f527db2a7214b&p=&a=Galina+VPAID+app+&cmp=9195&org=TrUza3udrufracrayupr&rt=displayImg&sl=1&fmt=video&app=9f80664813&gid=6626b8ab9ce38796d32f527db2a7214b&aid=6626b8ab9ce38796d32f527db2a7214b\n" +
                    "]]>\n" +
                    "</Impression>\n" +
                    "<Impression>\n" +
                    "<![CDATA[\n" +
                    "https://c.fqtag.com/tag/implement-r.js?org=TrUza3udrufracrayupr&s=6626b8ab9ce38796d32f527db2a7214b&p=Galina+VPAID+app+&a=test.com&cmp=Galina+VPAID+&fmt=banner&rd=Galina+VPAID+app+&rt=display&ex=&gid=6626b8ab9ce38796d32f527db2a7214b&aid=6626b8ab9ce38796d32f527db2a7214b&applng=%7Blanguage%7D&sl=1&fq=1&c1=9195&c2=brand\n" +
                    "]]>\n" +
                    "</Impression>\n" +
                    "<Impression>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=INBOX_OPEN&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Impression>\n" +
                    "<Impression>\n" +
                    "<![CDATA[ https://impression.co,/pixel.gif ]]>\n" +
                    "</Impression>\n" +
                    "<Creatives>\n" +
                    "<Creative id=\"72015\" sequence=\"1\">\n" +
                    "<Linear>\n" +
                    "<Duration>00:00:20</Duration>\n" +
                    "<TrackingEvents>\n" +
                    "<Tracking event=\"start\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_STARTS&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"start\">\n" +
                    "<![CDATA[ https://www.test.com/start ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"firstQuartile\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_25&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"firstQuartile\">\n" +
                    "<![CDATA[ https://www.test.com/firstQuartile ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"midpoint\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_50&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"midpoint\">\n" +
                    "<![CDATA[ https://www.test.com/midpoint ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"thirdQuartile\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_75&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"thirdQuartile\">\n" +
                    "<![CDATA[ https://www.test.com/thirdQuartile ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"complete\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_COMPLETES&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"complete\">\n" +
                    "<![CDATA[ https://www.test.com/complete ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"pause\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_PAUSE&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"pause\">\n" +
                    "<![CDATA[ https://www.test.com/pause ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"resume\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_RESUME&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"close\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=CLOSE&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI&playtime=[CONTENTPLAYHEAD]\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"fullscreen\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_FULLSCREEN&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"fullscreen\">\n" +
                    "<![CDATA[ https://www.test.com/fullscreen ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"exitFullscreen\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_EXIT_FULLSCREEN&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"skip\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_SKIP&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI&playtime=[CONTENTPLAYHEAD]\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"mute\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_MUTE&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"mute\">\n" +
                    "<![CDATA[ https://www.test.com/mute ]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"unmute\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_UNMUTE&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"progress\" offset=\"00:00:02\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_2SEC&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "<Tracking event=\"progress\" offset=\"00:00:15\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_15SEC&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "</TrackingEvents>\n" +
                    "<VideoClicks>\n" +
                    "<ClickThrough>\n" +
                    "<![CDATA[ https://www.google.com ]]>\n" +
                    "</ClickThrough>\n" +
                    "<ClickTracking>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=VIDEO_CLICK&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI&playtime=[CONTENTPLAYHEAD]\n" +
                    "]]>\n" +
                    "</ClickTracking>\n" +
                    "<ClickTracking>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=CUSTOM&name=postback_click&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</ClickTracking>\n" +
                    "<ClickTracking>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/go/57ee72ae2ce9b260b967eb97?meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI&lmhref=about:blank\n" +
                    "]]>\n" +
                    "</ClickTracking>\n" +
                    "<ClickTracking>\n" +
                    "<![CDATA[ https://click_tracking.com/pixel.gif ]]>\n" +
                    "</ClickTracking>\n" +
                    "</VideoClicks>\n" +
                    "<MediaFiles>\n" +
                    "<MediaFile scalable=\"false\" id=\"1\" delivery=\"progressive\" type=\"video/mp4\" bitrate=\"600\" width=\"140\" height=\"60\">\n" +
                    "<![CDATA[\n" +
                    "http://video.advertserve.com/examples/bigbuckbunny.mp4\n" +
                    "]]>\n" +
                    "</MediaFile>\n" +
                    "</MediaFiles>\n" +
                    "</Linear>\n" +
                    "</Creative>\n" +
                    "<Creative id=\"72015\" sequence=\"1\">\n" +
                    "<CompanionAds>\n" +
                    "<Companion width=\"500\" height=\"500\">\n" +
                    "<StaticResource creativeType=\"image/jpeg\">\n" +
                    "<![CDATA[ https://i.loopme.me/9140690af2e78e76.jpg ]]>\n" +
                    "</StaticResource>\n" +
                    "<TrackingEvents>\n" +
                    "<Tracking event=\"creativeView\">\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=COMPANION_SHOW&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</Tracking>\n" +
                    "</TrackingEvents>\n" +
                    "<CompanionClickThrough>\n" +
                    "<![CDATA[ https://www.google.com ]]>\n" +
                    "</CompanionClickThrough>\n" +
                    "<CompanionClickTracking>\n" +
                    "<![CDATA[\n" +
                    "https://track.loopme.me/sj/tr?et=COMPANION_CLICK&id=57ee72ae2ce9b260b967eb97&meta=NzIwMTU6Mjc5MDE6NjYyNmI4YWI5Y2UzODc5NmQzMmY1MjdkYjJhNzIxNGI\n" +
                    "]]>\n" +
                    "</CompanionClickTracking>\n" +
                    "</Companion>\n" +
                    "</CompanionAds>\n" +
                    "</Creative>\n" +
                    "</Creatives>\n" +
                    "</InLine>\n" +
                    "</Ad>\n" +
                    "</VAST>";

    public static String getVast() {
        return DATA;
    }

}
