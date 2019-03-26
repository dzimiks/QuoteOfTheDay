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
    public static final String STYLE = "@import url(https://fonts.googleapis.com/css?family=Roboto+Slab);@import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);@import url(https://fonts.googleapis.com/css?family=Ubuntu);*{box-sizing:border-box;font-family:Roboto,sans-serif!important}body,html{margin:0;padding:0}body{background-color:#292a2b}.blockquote-wrapper{display:flex;height:100vh;padding:0 20px}.blockquote{position:relative;max-width:620px;margin:80px auto;align-self:center}.blockquote h1{position:relative;color:#e74848;font-size:2.8rem;font-weight:400;line-height:1;margin:0;border:2px solid #fff;border:solid 2px;border-radius:20px;padding:25px}.blockquote h1:after{content:\"\";position:absolute;border:2px solid #e74848;border-radius:0 50px 0 0;width:60px;height:80px;bottom:-82px;left:50px;border-bottom:none;border-left:none;z-index:3}.blockquote h1:before{content:\"\";position:absolute;width:80px;border:6px solid #292a2b;bottom:-3px;left:50px;z-index:2}@media all and (min-width:600px){.blockquote h1{font-size:3rem;line-height:1.2}}.blockquote h4{position:relative;color:#fff;font-size:1.3rem;font-weight:400;line-height:1.2;margin:0;padding-top:15px;z-index:1;margin-left:150px;padding-left:12px}.blockquote p{position:relative;line-height:1.2;margin:0;padding-top:15px;z-index:1;margin-left:150px;padding-left:0}.blockquote h4:first-letter{margin-left:-12px}.loader-wrapper{position:fixed;top:0;left:0;width:100%;height:100%;z-index:1000}.loader-wrapper .loader{display:block;position:relative;left:50%;top:50%;width:100px;height:100px;margin-top:-50px;margin-left:-50px;border:3px solid transparent;border-top-color:#328ffe;border-radius:50%;z-index:1001;animation:spin 1.5s infinite linear}.loader-wrapper .loader:after,.loader-wrapper .loader:before{content:'';position:absolute;border-radius:50%}.loader-wrapper .loader:before{top:5px;left:5px;right:5px;bottom:5px;border:3px solid transparent;border-top-color:#e74c3c;animation:spin 2s infinite linear}.loader-wrapper .loader:after{top:15px;left:15px;right:15px;bottom:15px;border:3px solid transparent;border-top-color:#f9c922;animation:spin 1s infinite linear}.loader-wrapper .loader-image{display:block;position:relative;left:50%;top:60%;width:8rem;margin-left:-70px;z-index:1001}@keyframes spin{0%{transform:rotate(0)}100%{transform:rotate(360deg)}}.loader-section{position:fixed;top:0;width:100%;height:100%;background-color:#fff;z-index:1000}.loaded .loader{transition:all .3s 1s ease-out;opacity:0}.loaded .loader-wrapper{visibility:hidden;transition:all .3s 1s ease-out;-webkit-transition:all .3s 1s ease-out;-moz-transition:all .3s 1s ease-out;-o-transition:all .3s 1s ease-out}.text-muted{color:#999}";
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
