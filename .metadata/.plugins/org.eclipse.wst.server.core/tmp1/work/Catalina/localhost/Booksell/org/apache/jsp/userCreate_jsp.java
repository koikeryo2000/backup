/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-01-25 08:22:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1513924670639L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-koike/backup/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Booksell/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("<title>新規会員登録入力ページ</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h3>登録ページ</h3>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("\t\t\t");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fform_005f0.setParent(null);
    // /userCreate.jsp(16,3) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fform_005f0.setAction("UserCreateConfirmAction");
    int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
    if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_005fform_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>ログインID:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<input type=\"text\" required=\"required\" name=\"loginUserId\" value=\"\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>ログインPASS:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<input type=\"text\" required=\"required\" name=\"loginUserPassword\" value=\"\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>ユーザー名:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<input type=\"text\"required=\"required\" name=\"userName\" value=\"\" />\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>年齢:</td>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t<select required=\"required\" name=\"year\" >\n");
        out.write("<option value=\"\">-</option>\n");
        out.write("<option value=\"0\">0</option>\n");
        out.write("<option value=\"1\">1</option>\n");
        out.write("<option value=\"2\">2</option>\n");
        out.write("<option value=\"3\">3</option>\n");
        out.write("<option value=\"4\">4</option>\n");
        out.write("<option value=\"5\">5</option>\n");
        out.write("<option value=\"6\">6</option>\n");
        out.write("<option value=\"7\">7</option>\n");
        out.write("<option value=\"8\">8</option>\n");
        out.write("<option value=\"9\">9</option>\n");
        out.write("<option value=\"10\">10</option>\n");
        out.write("<option value=\"11\">11</option>\n");
        out.write("<option value=\"12\">12</option>\n");
        out.write("<option value=\"13\">13</option>\n");
        out.write("<option value=\"14\">14</option>\n");
        out.write("<option value=\"15\">15</option>\n");
        out.write("<option value=\"16\">16</option>\n");
        out.write("<option value=\"17\">17</option>\n");
        out.write("<option value=\"18\">18</option>\n");
        out.write("<option value=\"19\">19</option>\n");
        out.write("<option value=\"20\">20</option>\n");
        out.write("<option value=\"21\">21</option>\n");
        out.write("<option value=\"22\">22</option>\n");
        out.write("<option value=\"23\">23</option>\n");
        out.write("<option value=\"24\">24</option>\n");
        out.write("<option value=\"25\">25</option>\n");
        out.write("<option value=\"26\">26</option>\n");
        out.write("<option value=\"27\">27</option>\n");
        out.write("<option value=\"28\">28</option>\n");
        out.write("<option value=\"29\">29</option>\n");
        out.write("<option value=\"30\">30</option>\n");
        out.write("<option value=\"31\">31</option>\n");
        out.write("<option value=\"32\">32</option>\n");
        out.write("<option value=\"33\">33</option>\n");
        out.write("<option value=\"34\">34</option>\n");
        out.write("<option value=\"35\">35</option>\n");
        out.write("<option value=\"36\">36</option>\n");
        out.write("<option value=\"37\">37</option>\n");
        out.write("<option value=\"38\">38</option>\n");
        out.write("<option value=\"39\">39</option>\n");
        out.write("<option value=\"40\">40</option>\n");
        out.write("<option value=\"41\">41</option>\n");
        out.write("<option value=\"42\">42</option>\n");
        out.write("<option value=\"43\">43</option>\n");
        out.write("<option value=\"44\">44</option>\n");
        out.write("<option value=\"45\">45</option>\n");
        out.write("<option value=\"46\">46</option>\n");
        out.write("<option value=\"47\">47</option>\n");
        out.write("<option value=\"48\">48</option>\n");
        out.write("<option value=\"49\">49</option>\n");
        out.write("<option value=\"50\">50</option>\n");
        out.write("<option value=\"51\">51</option>\n");
        out.write("<option value=\"52\">52</option>\n");
        out.write("<option value=\"53\">53</option>\n");
        out.write("<option value=\"54\">54</option>\n");
        out.write("<option value=\"55\">55</option>\n");
        out.write("<option value=\"56\">56</option>\n");
        out.write("<option value=\"57\">57</option>\n");
        out.write("<option value=\"58\">58</option>\n");
        out.write("<option value=\"59\">59</option>\n");
        out.write("<option value=\"60\">60</option>\n");
        out.write("<option value=\"61\">61</option>\n");
        out.write("<option value=\"62\">62</option>\n");
        out.write("<option value=\"63\">63</option>\n");
        out.write("<option value=\"64\">64</option>\n");
        out.write("<option value=\"65\">65</option>\n");
        out.write("<option value=\"66\">66</option>\n");
        out.write("<option value=\"67\">67</option>\n");
        out.write("<option value=\"68\">68</option>\n");
        out.write("<option value=\"69\">69</option>\n");
        out.write("<option value=\"70\">70</option>\n");
        out.write("<option value=\"71\">71</option>\n");
        out.write("<option value=\"72\">72</option>\n");
        out.write("<option value=\"73\">73</option>\n");
        out.write("<option value=\"74\">74</option>\n");
        out.write("<option value=\"75\">75</option>\n");
        out.write("<option value=\"76\">76</option>\n");
        out.write("<option value=\"77\">77</option>\n");
        out.write("<option value=\"78\">78</option>\n");
        out.write("<option value=\"79\">79</option>\n");
        out.write("<option value=\"80\">80</option>\n");
        out.write("<option value=\"81\">81</option>\n");
        out.write("<option value=\"82\">82</option>\n");
        out.write("<option value=\"83\">83</option>\n");
        out.write("<option value=\"84\">84</option>\n");
        out.write("<option value=\"85\">85</option>\n");
        out.write("<option value=\"86\">86</option>\n");
        out.write("<option value=\"87\">87</option>\n");
        out.write("<option value=\"88\">88</option>\n");
        out.write("<option value=\"89\">89</option>\n");
        out.write("<option value=\"90\">90</option>\n");
        out.write("<option value=\"91\">91</option>\n");
        out.write("<option value=\"92\">92</option>\n");
        out.write("<option value=\"93\">93</option>\n");
        out.write("<option value=\"94\">94</option>\n");
        out.write("<option value=\"95\">95</option>\n");
        out.write("<option value=\"96\">96</option>\n");
        out.write("<option value=\"97\">97</option>\n");
        out.write("<option value=\"98\">98</option>\n");
        out.write("<option value=\"99\">99</option>\n");
        out.write("</select> 歳\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t<input type=\"radio\" required=\"required\" name=\"sex\" value=\"男\"> 男性\n");
        out.write("\t\t\t\t<input type=\"radio\" required=\"required\" name=\"sex\" value=\"女\"> 女性\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>住所:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t<input type=\"text\" required=\"required\" name=\"streetAddress\" value=\"\" />\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>電話番号:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t<input type=\"text\"required=\"required\" name=\"phoneNumber\" value=\"\" />\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t\t\t<label>メールアドレス:</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t<td>\n");
        out.write("\t\t\t\t<input type=\"text\"required=\"required\" name=\"mailAddress\" value=\"\" />\n");
        out.write("\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fform_0026_005faction.reuse(_jspx_th_s_005fform_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
    // /userCreate.jsp(185,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fsubmit_005f0.setValue("登録");
    int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
    if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
    return false;
  }
}
