/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2023-05-08 08:38:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class Landing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1683446878380L));
    _jspx_dependants.put("jar:file:/C:/Users/kafle/OneDrive/Desktop/Final%20Submission%20Of%20Code/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/HamroPasal/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425957970000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/CSS/navbar.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/CSS/home.css\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Mochiy+Pop+One&family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/JS/profile.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /View/Landing.jsp(24,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("time");
      // /View/Landing.jsp(24,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new Date().getTime() );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <span class=\"logo\">Hamro&nbsp;Pasal</span>\n");
      out.write("        <div class=\"right\">\n");
      out.write("        \t<a href=\"\" class=\"dropbtn section\">Category</a>\n");
      out.write("        \t<div class=\"dropdown-content\">\n");
      out.write("          \t\t<a href=\"./category?by=price\">By Price</a>\n");
      out.write("          \t\t<a href=\"./category?by=sale\">By Sales</a>\n");
      out.write("        \t</div>\n");
      out.write("        \t\n");
      out.write("            <script>\n");
      out.write("    \t\t\tconst select = document.querySelector(\".dropbtn\")\n");
      out.write("    \t\t\tconst option = document.querySelector(\".dropdown-content\")\n");
      out.write("\t\t        \t\t\n");
      out.write("\t\t    \tselect.addEventListener(\"mouseenter\", ()=>{\n");
      out.write("    \t\t\t\toption.style.display = \"block\";\n");
      out.write("    \t\t\t\toption.style.top=\"80px\";\n");
      out.write("    \t\t\t\toption.style.opacity = \"1\";\n");
      out.write("    \t\t\t})\n");
      out.write("    \t\t\toption.addEventListener(\"mouseleave\", ()=>{\n");
      out.write("    \t\t\t\toption.style.top=\"-20%\";\n");
      out.write("    \t\t\t\toption.style.opacity = \"0\";\n");
      out.write("    \t\t\t})\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/search\" class=\"search-bar\">\n");
      out.write("                <input type=\"text\" name = \"item-name\" class=\"search-field\" placeholder=\"Search this Website\" onclick=\"searchClicked()\">\n");
      out.write("                <input type=\"submit\" id=\"search\">\n");
      out.write("                <label for=\"search\"><i class='bx bx-search-alt-2'></i></label>\n");
      out.write("            </form>\n");
      out.write("            <script>\n");
      out.write("            \tconst searchClicked = ()=>{\n");
      out.write("            \t\tdocument.querySelector(\".search-result\").style.top=\"70px\";\n");
      out.write("            \t\tdocument.querySelector(\".search-result\").style.opacity=\"1\";\n");
      out.write("            \t}\n");
      out.write("            </script>\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <div class=\"cart\" onclick=\"cartClicked()\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/Images/shopping-cart.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"profile\" onclick=\"profileClicked()\">\n");
      out.write("                    <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/Images/user.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"profile-section\">\n");
      out.write("        \t<div class=\"top\">\n");
      out.write("                <h1>User Profile</h1>\n");
      out.write("                <i class='bx bxl-xing' onclick=\"profileClicked()\"></i>\n");
      out.write("            </div>\n");
      out.write("        \t");
 String email = null;
        	if(session.getAttribute("loggedInId") == null){ 
        	
      out.write("\n");
      out.write("            \t<div class=\"middle\">\n");
      out.write("\t                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/AdminLogin.jsp\">Login as Admin</a>\n");
      out.write("                \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/Login.jsp\">Login as User</a>\n");
      out.write("        \t");
} else{
        		email = session.getAttribute("loggedInId").toString();
        	
      out.write("\n");
      out.write("        \t\t<h1>You are Logged In as ");
      out.print( email );
      out.write("</h1>\n");
      out.write("        \t\t");
if(session.getAttribute("adminEmail") != null){
      out.write("\n");
      out.write("        \t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/index.jsp\">Return to Home</a><br/>\n");
      out.write("        \t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/AdminPage.jsp\">Admin Page</a><br/>\n");
      out.write("        \t\t");
}
      out.write("\n");
      out.write("        \t\t\n");
      out.write("        \t\t");
if(session.getAttribute("adminEmail") == null && session.getAttribute("loggedInId") != null){
      out.write("\n");
      out.write("         \t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/editProfile?email=");
      out.print(email);
      out.write(" class=\"edit-profile-btn\">Edit Profile</a><br/>\n");
      out.write(" \n");
      out.write("        \t\t");
}
      out.write("\n");
      out.write("        \t\t\n");
      out.write("        \t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout\">Log Out</a>\n");
      out.write("        \t");
} 
      out.write("\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"cart-section\">\n");
      out.write("        \t<div class=\"top\">\n");
      out.write("                <h1>Cart Items</h1>\n");
      out.write("                <i class='bx bxl-xing' onclick=\"profileClicked()\"></i>\n");
      out.write("            </div>\n");
      out.write("        \t<div class=\"middle\" id=\"middle\">\n");
      out.write("\t\t\t\t\n");
      out.write("            </div>\n");
      out.write("        \t<div class=\"lower\">\n");
      out.write("        \t\t<span><p class=\"index\">Total Price: </p><p class=\"total-price\"></p></span>\n");
      out.write("        \t\t<a href=\"\" id = \"order\" onclick=\"clicked()\">Order Now!</a>\n");
      out.write("        \t</div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            const profileClicked = () =>{\n");
      out.write("                const btn = document.querySelector(\".profile\")\n");
      out.write("                const mainDiv = document.querySelector(\".profile-section\")\n");
      out.write("                const cross = document.querySelector(\".profile-section .top i\")\n");
      out.write("                btn.addEventListener(\"click\", ()=>{\n");
      out.write("                    mainDiv.classList.add(\"active\");\n");
      out.write("                })\n");
      out.write("                cross.addEventListener(\"click\", ()=>{\n");
      out.write("                    mainDiv.classList.remove(\"active\");\n");
      out.write("                })\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            const cartClicked = () =>{\n");
      out.write("            \t");
if(session.getAttribute("adminEmail") == null && session.getAttribute("loggedInId") != null){ 
      out.write("\n");
      out.write("                const btn = document.querySelector(\".cart\")\n");
      out.write("                const mainDiv = document.querySelector(\".cart-section\")\n");
      out.write("                const cross = document.querySelector(\".cart-section .top i\")\n");
      out.write("                btn.addEventListener(\"click\", ()=>{\n");
      out.write("                    mainDiv.classList.add(\"active\");\n");
      out.write("                })\n");
      out.write("                cross.addEventListener(\"click\", ()=>{\n");
      out.write("                    mainDiv.classList.remove(\"active\");\n");
      out.write("                })\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                let cartDisplay = document.getElementById(\"middle\");\n");
      out.write("\t\t\t\tlet totalPriceDisp = document.querySelector(\".lower .total-price\");\n");
      out.write("                // Create an empty string to store the HTML content\n");
      out.write("                let cartHtml = \"\";\n");
      out.write("\t\t\t\tlet totalPrice = 0;\n");
      out.write("                // Loop through the cart object and generate HTML for each item\n");
      out.write("                cartItems.forEach((item) => {\n");
      out.write("                  cartHtml += `\n");
      out.write("                \t<div class=\"item\">\n");
      out.write("  \t\t\t\t\t\t<img src=/HamroPasal/Images/`+item.image+`?v=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/>\n");
      out.write("  \t\t\t\t\t\t<span>\n");
      out.write("  \t\t\t\t\t\t\t<h3>`+item.name+`</h3>\n");
      out.write("\t  \t\t\t\t\t\t<p>Price: Rs. `+item.price+`</p>\n");
      out.write("\t  \t\t\t\t\t</span>\n");
      out.write("  \t\t\t\t\t</div>\n");
      out.write("                  `;\n");
      out.write("                  totalPrice += parseInt(item.price);\n");
      out.write("                })\n");
      out.write("                \n");
      out.write("\n");
      out.write("                // Set the innerHTML of the cart display element to the generated HTML content\n");
      out.write("                cartDisplay.innerHTML = cartHtml;\n");
      out.write("                totalPriceDisp.innerText = totalPrice;\n");
      out.write("                ");
}else{
      out.write("\n");
      out.write("                \twindow.location.href = \"./View/Login.jsp\"\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <section class=\"banner\">\n");
      out.write("        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/View/Images/banner.gif\" alt=\"\">\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\tconst stock = (qty) =>{\n");
      out.write("\t\t\treturn qty\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("    <section class=\"products-section\">\n");
      out.write("        <h2>Products</h2>\n");
      out.write("        <div class=\"products\">\n");
      out.write("        \t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <script>\n");
      out.write("    \tvar itemsIds = []\n");
      out.write("    \tvar cartItems = []\n");
      out.write("    \tconst addToCart = (id, name, price, image) => {\n");
      out.write("    \t\t");
if(session.getAttribute("adminEmail") == null && session.getAttribute("loggedInId") != null){ 
      out.write("\n");
      out.write("    \t\titemsIds.push(id)\n");
      out.write("    \t\tcartItem = {\n");
      out.write("    \t\t\tid: id,\n");
      out.write("    \t\t\tname: name,\n");
      out.write("    \t\t\tprice: price,\n");
      out.write("    \t\t\timage: image\n");
      out.write("    \t\t}\n");
      out.write("    \t\tcartItems.push(cartItem)\n");
      out.write("    \t\tcartClicked()\n");
      out.write("    \t\t");
}else{
      out.write("\n");
      out.write("        \t\twindow.location.href = \"./View/Login.jsp\"\n");
      out.write("        \t");
}
      out.write("\n");
      out.write("    \t}\n");
      out.write("    \tvar items = \"\"\n");
      out.write("    \tconst orderNow = () =>{\n");
      out.write("    \t\titemsIds.forEach((item)=>{\n");
      out.write("    \t\t\titems = items.concat(item,\":\")\n");
      out.write("    \t\t})\n");
      out.write("    \t\treturn items;\n");
      out.write("    \t}\n");
      out.write("    \tconst clicked = () =>{\n");
      out.write("    \t\tif(orderNow() != \"\"){\n");
      out.write("    \t\t\tdocument.getElementById(\"order\").href=\"./order?items=\"+orderNow();\n");
      out.write("    \t\t}\n");
      out.write("    \t\telse{\n");
      out.write("    \t\t\talert(\"Your Cart Is Empty\");\n");
      out.write("    \t\t}\n");
      out.write("    \t\t//console.log(orderNow())\n");
      out.write("    \t}\n");
      out.write("\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /View/Landing.jsp(182,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("pd");
    // /View/Landing.jsp(182,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/View/Landing.jsp(182,9) '${productList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${productList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t<div class=\"product\">\n");
          out.write("                \t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/Images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productImagePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write('?');
          out.write('v');
          out.write('=');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${time}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" alt=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                \t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                \t<span><span style=\"color: rgba(0,0,0,0.5);\">Rs. </span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productPrice }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                \t<span class=\"add-btn\" onclick=\"addToCart('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productPrice}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productImagePath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("')\">Add to Cart</span>\n");
          out.write("                \t<b>Available Stock: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd.productQuantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</b>\n");
          out.write("            \t</div>\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}