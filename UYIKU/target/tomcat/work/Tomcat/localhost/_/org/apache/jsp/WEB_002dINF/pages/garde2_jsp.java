/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-04-07 03:08:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class garde2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Pragma\" contect=\"no-cache\">\r\n");
      out.write("<link href=\"/staticfile/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("iframe {\r\n");
      out.write("\topacity: 0;\r\n");
      out.write("}\r\n");
      out.write("a, input, div, textarea {\r\n");
      out.write("\toutline: none;\r\n");
      out.write("}\r\n");
      out.write("html, body, h1, h2, h3, h4, ul, li, ol, dl, dt, dd, form, p, input, textarea {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("ul, dl, ol, li {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("}\r\n");
      out.write("html {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tfont-family: \"Helvetica\", \"微软雅黑\", \"华文细黑\", \"黑体\";\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("\t-webkit-text-size-adjust: none;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("img {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("}\r\n");
      out.write("h1, h2, h3 {\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("}\r\n");
      out.write(".clear {\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes flipintoright {\r\n");
      out.write("0% {\r\n");
      out.write("\ttransform: scale(1,1);\r\n");
      out.write("}\r\n");
      out.write("40% {\r\n");
      out.write("\ttransform: scale(1.2,1.2);\r\n");
      out.write("}\r\n");
      out.write("100% {\r\n");
      out.write("\ttransform: scale(1.1,1.1);\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@-webkit-keyframes flipintoright2 {\r\n");
      out.write("0% {\r\n");
      out.write("\ttransform: scale(1.1,1.1);\r\n");
      out.write("}\r\n");
      out.write("100% {\r\n");
      out.write("\ttransform: scale(1,1);\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tbackground: url(\"/staticfile/images/welcome.jpg\") no-repeat center center;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\tmin-width: 1010px;\r\n");
      out.write("\tmin-height: 660px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-main {\r\n");
      out.write("\tbackground: url(\"img/bg02_summer.jpg\") no-repeat center center;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmin-width: 1020px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-blockList {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 55%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-top: -200px;\r\n");
      out.write("\tmargin-left: -500px;\r\n");
      out.write("\twidth: 1020px;\r\n");
      out.write("}\r\n");
      out.write(".page-block {\r\n");
      out.write("\twidth: 200px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-right: 50px;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\t-webkit-animation-name: flipintoright2;\r\n");
      out.write("\t-webkit-animation-duration: 300ms;\r\n");
      out.write("\tanimation-name: flipintoright2;\r\n");
      out.write("\tanimation-duration: 300ms;\r\n");
      out.write("}\r\n");
      out.write(".page-blockList .page-block:last-child {\r\n");
      out.write("\tmargin-right: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-block:last-child {\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-block:hover {\r\n");
      out.write("\t-webkit-animation-name: flipintoright;\r\n");
      out.write("\t-webkit-animation-duration: 300ms;\r\n");
      out.write("\tanimation-name: flipintoright;\r\n");
      out.write("\tanimation-duration: 300ms;\r\n");
      out.write("\ttransform: scale(1.1,1.1);\r\n");
      out.write("}\r\n");
      out.write(".page-block > .bigIcon {\r\n");
      out.write("\theight: 145px;\r\n");
      out.write("\tbackground: url(\"img/icon1.png\") no-repeat center center;\r\n");
      out.write("\tbackground-color: #BCB5B6;\r\n");
      out.write("\t-webkit-transition: background-color 0.5s ease-out;\r\n");
      out.write("\tborder-radius: 5px 5px 0 0;\r\n");
      out.write("}\r\n");
      out.write(".page-block:hover > .bigIcon {\r\n");
      out.write("\tbackground-color: #e94f78;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-block > .bigIcon.icon1 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/clothes.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block:hover > .bigIcon.icon1 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/clothes.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block > .bigIcon.icon2 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/collocation.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block:hover > .bigIcon.icon2 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/collocation.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block > .bigIcon.icon3 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/statistics.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block:hover > .bigIcon.icon3 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/statistics.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block > .bigIcon.icon4 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/recommend.png\");\r\n");
      out.write("}\r\n");
      out.write(".page-block:hover > .bigIcon.icon4 {\r\n");
      out.write("\tbackground-image: url(\"/staticfile/images/recommend.png\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".page-block .title {\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tpadding: 12px 12px 0px 12px;\r\n");
      out.write("\tcolor: #5a5a5a;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("}\r\n");
      out.write(".page-block .desc {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tpadding: 8px 12px 0px 12px;\r\n");
      out.write("\tcolor: #a1a1a1;\r\n");
      out.write("\tline-height: 21px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".page-block .image {\r\n");
      out.write("\twidth: 99px;\r\n");
      out.write("\theight: 78px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 10px;\r\n");
      out.write("\tbottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-logo {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: -190px;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tmargin-left: -165px;\r\n");
      out.write("\theight: 148px;\r\n");
      out.write("\twidth: 331px;\r\n");
      out.write("\tbackground: url(\"img/logo02_summer.png\") no-repeat center center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-footer {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tbottom: 60px;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #8f8f8f;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-clearLocal {\r\n");
      out.write("\tcolor: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-logos {\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tbottom: -70px;\r\n");
      out.write("\tmargin-left: -180px;\r\n");
      out.write("}\r\n");
      out.write(".page-logos > img {\r\n");
      out.write("\tmargin-right: 13px;\r\n");
      out.write("}\r\n");
      out.write("a.downbtn{\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("a.downbtn:hover{\r\n");
      out.write("\tcolor: #8f8f8f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#imgHead{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 7%;\r\n");
      out.write("\tright:25%;\r\n");
      out.write("\twidth:135px;\r\n");
      out.write("\theight:135px;\r\n");
      out.write("}\r\n");
      out.write("#imgHead img{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("}\r\n");
      out.write("#back{\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright:100px;\r\n");
      out.write("\tbottom:100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>UYK</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("if(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userUrl.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("==null){\r\n");
      out.write("\twindow.location.reload();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"page-main\">\r\n");
      out.write("\t\t\t<div id=\"imgHead\"><img class=\"img-circle\" src=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userUrl.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"page-blockList\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<a href=\"toclothUpList.action?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"page-block\" target=\"_self\">\r\n");
      out.write("\t\t\t\t\t<div class=\"bigIcon icon1\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"title\">私人衣橱</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc\">这里提供各种个性化的标签,方便您快速标记和收纳你的衣服,为您建立无限量的云中衣橱.</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a href=\"tosuitList.action?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"page-block\" target=\"_self\">\r\n");
      out.write("\t\t\t\t\t<div class=\"bigIcon icon2\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"title\">套装搭配</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc\">告别纠结,保留经典,自主定制套装.为您,也为您心爱的他.</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a href=\"countCloth.action?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"page-block\" target=\"_self\">\r\n");
      out.write("\t\t\t\t\t<div class=\"bigIcon icon3\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"title\">衣橱统计</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc\">智能管理衣橱,管理搭配,随时了解衣橱情况.极大提高衣橱管理和穿衣决策效率.</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<a href=\"tostar.action?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" class=\"page-block\" target=\"_self\">\r\n");
      out.write("\t\t\t\t\t<div class=\"bigIcon icon4\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"title\">明星推荐</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"desc\">无论是工作中,还是shopping时,只要您遇到穿什么,和怎么搭配的问题时,都可以在这里找到最时尚的搭配方案.</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"back\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\"><img src=\"/staticfile/images/back.png\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"page-footer\">@穿云箭项目组版权所有 杭IQ备88888888号-8 </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}