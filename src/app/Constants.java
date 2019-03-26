package app;

/**
 * @author dzimiks
 * Date: 26-03-2019 at 12:30
 */
public class Constants {

    public static final int PORT = 7777;
    public static final String RESPONSE = "HTTP/1.1 200 OK";
    public static final String NEW_LINE = "\r\n";
    public static final String NEW_LINE_END = "\r\n\r\n";
    public static final String PRE_HTML = "<!DOCTYPE html><html lang=\"en\"><head><title>Quote Of The Day</title><meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"><meta charset=\"UTF-8\">";
    public static final String STYLE = "@import url(https://fonts.googleapis.com/css?family=Roboto+Slab);@import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);@import url(https://fonts.googleapis.com/css?family=Ubuntu);*{box-sizing:border-box;font-family:Roboto,sans-serif!important}html{margin:0;padding:0}body{margin:0;padding:0;min-width:320px;font-size:16px;line-height:1.52947;font-weight:400;letter-spacing:-.021em;color:#333;font-style:normal}.quote{position:fixed;top:50%;left:50%;-moz-transform:translate(-50%,-50%);-o-transform:translate(-50%,-50%);-ms-transform:translate(-50%,-50%);-webkit-transform:translate(-50%,-50%);transform:translate(-50%,-50%)}blockquote{background:#f9f9f9;border-left:10px solid #ccc;margin:0;padding:.5em 10px;quotes:\"\\201C\" \"\\201D\" \"\\2018\" \"\\2019\"}blockquote:before{color:#ccc;content:open-quote;font-size:4em;line-height:.1em;margin-right:.25em;vertical-align:-.4em}blockquote h1{display:inline}.loader-wrapper{position:fixed;top:0;left:0;width:100%;height:100%;z-index:1000}.loader-wrapper .loader{display:block;position:relative;left:50%;top:50%;width:100px;height:100px;margin-top:-50px;margin-left:-50px;border:3px solid transparent;border-top-color:#328ffe;border-radius:50%;z-index:1001;animation:spin 1.5s infinite linear}.loader-wrapper .loader:after,.loader-wrapper .loader:before{content:'';position:absolute;border-radius:50%}.loader-wrapper .loader:before{top:5px;left:5px;right:5px;bottom:5px;border:3px solid transparent;border-top-color:#e74c3c;animation:spin 2s infinite linear}.loader-wrapper .loader:after{top:15px;left:15px;right:15px;bottom:15px;border:3px solid transparent;border-top-color:#f9c922;animation:spin 1s infinite linear}.loader-wrapper .loader-image{display:block;position:relative;left:50%;top:60%;width:8rem;margin-left:-70px;z-index:1001}@keyframes spin{0%{transform:rotate(0)}100%{transform:rotate(360deg)}}.loader-section{position:fixed;top:0;width:100%;height:100%;background-color:#fff;z-index:1000}.loaded .loader{transition:all .3s 1s ease-out;opacity:0}.loaded .loader-wrapper{visibility:hidden;transition:all .3s 1s ease-out;-webkit-transition:all .3s 1s ease-out;-moz-transition:all .3s 1s ease-out;-o-transition:all .3s 1s ease-out}";
    public static final String LOADER_HTML = "<div class=\"loader-wrapper\"> <div class=\"loader\"></div> <div class=\"loader-section\"></div></div>";
    public static final String LOADER_SCRIPT = "<script>document.addEventListener(\"DOMContentLoaded\", (e) => { document.body.classList.add(\"loaded\"); });</script>";

    private static final String PRINCESS_DIANA_QUOTE = "Carry out a random act of kindness, with no expectation of reward, safe in the knowledge that one day someone might do the same for you.";
    private static final String PRINCESS_DIANA = "Princess Diana";
    private static final int PRINCESS_DIANA_QUOTE_LENGTH = PRINCESS_DIANA_QUOTE.length();
    private static final String PRINCESS_DIANA_TAGS = "[\"kindness\",\"day\",\"knowledge\",\"you\"]";

    public static final String LOCAL_QUOTE_1 = "{\"success\":{\"total\":1},\"contents\":{\"quotes\":[{\"quote\":\"Together we can change the world, just one random act of kindness at a time.\",\"author\":\"Ron Hall\",\"length\":63,\"tags\":[\"aspirations\",\"inspire\",\"passion\",\"values\"],\"category\":\"inspire\",\"title\":\"Inspiring Quote of the day\",\"date\":\"2019-03-25\",\"id\":null}]}}";
    public static final String LOCAL_QUOTE_2 = "{\"success\":{\"total\":1},\"contents\":{\"quotes\":[{\"quote\":\"Core passions and aspirations should be consistent and in sync.\",\"author\":\"Lorii Myers\",\"length\":63,\"tags\":[\"aspirations\",\"inspire\",\"passion\",\"values\"],\"category\":\"inspire\",\"title\":\"Inspiring Quote of the day\",\"date\":\"2019-03-26\",\"id\":null}]}}";
    public static final String PRINCESS_DIANA_LOCAL_QUOTE = "{\"success\":{\"total\":1},\"contents\":{\"quotes\":[{\"quote\":\""
            + PRINCESS_DIANA_QUOTE + "\",\"author\":\""
            + PRINCESS_DIANA + "\",\"length\":"
            + PRINCESS_DIANA_QUOTE_LENGTH + ",\"tags\":"
            + PRINCESS_DIANA_TAGS + ",\"category\":\"inspire\",\"title\":\"Inspiring Quote of the day\",\"date\":\"2019-03-26\",\"id\":null}]}}";
}
