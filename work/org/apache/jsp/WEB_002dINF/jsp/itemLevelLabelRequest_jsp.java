/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2013-06-28 10:42:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;
import net.sf.json.*;
import gr.ntua.ivml.mint.mapping.*;
import gr.ntua.ivml.mint.db.*;
import gr.ntua.ivml.mint.persistent.*;
import org.apache.log4j.Logger;
import gr.ntua.ivml.mint.db.DB;

public final class itemLevelLabelRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public final Logger log = Logger.getLogger(this.getClass());
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
      response.setContentType("text/html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-body\">\n");
      out.write(" <div class=\"block-nav\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"summary\" style=\"border:none\">\n");
      out.write("<div style=\"width: 100%; height: 100%\">\n");


String uploadId = request.getParameter("uploadId");
if(uploadId == null) {

      out.write("<h1>Error: Missing uploadId parameter</h1>");
 
} else {
	DataUpload dataUpload = DB.getDataUploadDAO().findById(Long.parseLong(uploadId), false);
	
	boolean hasBlob = dataUpload.getLoadingStatus().equals(DataUpload.LOADING_OK);
	
	if(dataUpload.getTransformations().size()>0){
      out.write("\n");
      out.write("\t<div class=\"summary\" style=\"border:none\">\n");
      out.write("\t<div class=\"info\"><font color=\"red\">You must delete all transformations before redefining items.</font></div></div>\t\n");
      out.write("\t");
 } else{

      out.write("\n");
      out.write("\n");
      out.write("<div id=\"source_tree\" style=\"position:absolute; left:10px; width: 40%; height: 80%; overflow-y: none; overflow-x: auto; \"> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"boxes\">\n");
      out.write(" \n");
      out.write("    <div id=\"dialog\" class=\"window\">\n");
      out.write("         \n");
      out.write("        <!-- close button is defined as close class -->\n");
      out.write("        <a href=\"#\" class=\"close\">Close it</a>\n");
      out.write(" \n");
      out.write("    </div>\n");
      out.write("    <div id=\"mask\"></div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"position:absolute; right:5px; width: 55%; overflow-y: auto; padding: 5px; \">\n");
 if( hasBlob ) { 
      out.write("\n");
      out.write("<h2>Item Level</h2>\n");
 } 
      out.write("\r\n");
      out.write("<div style=\"color: #000000; margin-top: -5px; margin-bottom: 5px; margin-left:5px;\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"item_level_xpath\"\n");
      out.write("title=\"Define the root node of every item. Drag & drop a node from the tree to the left in the box below, to set the item level.\"\n");
      out.write("class=\"schema-tree-drop\"\n");
      out.write("upload=\"");
      out.print( uploadId );
      out.write("\" \n");
      out.write("style=\"word-wrap: break-word;overflow:hidden;color: #666666; padding: 3px; height:100px; font-size: 100%; border: 1px solid #CCCCCC;");
      out.print( hasBlob?"":"display: none" );
      out.write("\">\n");
      out.write("</div>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<span id=\"setlabel\" class=\"schema-tree-drop\" >\n");
      out.write("<h2>Item Label</h2>\r\n");
      out.write("<div style=\"color: #000000; margin-top: -5px; margin-bottom: 5px;margin-left:5px;\">\r\n");
      out.write("</div>\n");
      out.write("<div id=\"item_label_xpath\" title=\"Define the label that will be used as the Item name in the Item Overview. Drag & drop a node from the tree to the left in the box below, to set the item label.\" class=\"schema-tree-drop\" upload=\"");
      out.print( uploadId );
      out.write("\" style=\"word-wrap: break-word;overflow:hidden;color: #666666; padding: 3px; height:100px; font-size: 100%; border: 1px solid #CCCCCC\">\r\n");
      out.write("</div>\r\n");
      out.write("</span>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<span id=\"setid\" class=\"schema-tree-drop\" >\n");
      out.write("<h2>Item Id</h2>\n");
      out.write("<div style=\"color: #000000; margin-top: -5px; margin-bottom: 5px;margin-left:5px;\">\n");
      out.write("</div>\n");
      out.write("<div id=\"item_id_xpath\" title=\"Define the node that will be used as the Item native id. Drag & drop a node from the tree to the left in the box below, to set the item id.\" class=\"schema-tree-drop\" upload=\"");
      out.print( uploadId );
      out.write("\" style=\"word-wrap: break-word;overflow:hidden;color: #666666; padding: 3px; height:100px; font-size: 100%; border: 1px solid #CCCCCC\">\n");
      out.write("</div>\n");
      out.write("</span>\n");
      out.write("<br/>\n");
      out.write("\n");
      out.write("<a id=\"resetroot\" class=\"navigable focus k-focus\">Reset all</a>\n");
      out.write("&nbsp;&nbsp;|&nbsp;&nbsp;</span><a  id=\"doneroot\" class=\"navigable focus\">Done</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\"><!--\n");
      out.write("$(document).ready(function() {\n");
      out.write("\tfunction set_path(node, path) {\n");
      out.write("\t\tif(path.length > 0) {\n");
      out.write("\t\t\tnode.text(path);\n");
      out.write("\t\t\tnode.addClass(\"xpath\");\n");
      out.write("\t\t} else {\n");
      out.write("\t\t\tnode.text(node.attr(\"title\"));\n");
      out.write("\t\t\tnode.removeClass(\"xpath\");\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction get_path(node) {\n");
      out.write("\t\tif(node.hasClass(\"xpath\")) return node.text();\n");
      out.write("\t\telse return \"\";\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction reset_paths() {\n");
      out.write("\t");

	XpathHolder itemLevelXpath = dataUpload.getItemRootXpath();
	XpathHolder itemLabelXpath = dataUpload.getItemLabelXpath();
	XpathHolder itemIdXpath = dataUpload.getItemNativeIdXpath();		

	String itemLevel = (itemLevelXpath != null)?itemLevelXpath.getXpathWithPrefix(true):"";
	String itemLabel = (itemLabelXpath != null)?itemLabelXpath.getXpathWithPrefix(true):"";
	String itemId = (itemIdXpath != null)?itemIdXpath.getXpathWithPrefix(true):"";
	
      out.write("\n");
      out.write("\n");
      out.write("\t\tset_path($(\"#item_level_xpath\"), \"");
      out.print( itemLevel );
      out.write("\");\n");
      out.write("\t\tset_path($(\"#item_label_xpath\"), \"");
      out.print( itemLabel );
      out.write("\");\n");
      out.write("\t\tset_path($(\"#item_id_xpath\"), \"");
      out.print( itemId );
      out.write("\");\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfirstload=false;\n");
      out.write("\t\n");
      out.write("    uploadId=");
      out.print(request.getParameter("uploadId"));
      out.write(";\n");
      out.write("    isTransformed=");
      out.print(request.getParameter("transformed"));
      out.write(";\n");
      out.write("   \n");
      out.write("\ttree = new SchemaTree(\"source_tree\");\n");
      out.write("\ttree.loadFromDataUpload(uploadId);\n");
      out.write("\ttree.refresh();\n");
      out.write("\n");
      out.write("\treset_paths();\n");
      out.write("\n");
      out.write("//\trenderBrowser($('#vl'));\n");
      out.write("    \n");
      out.write("    tree.dropCallback = function (source,target) {\n");
      out.write("           if($(target).attr('id')==\"item_level_xpath\") {\n");
      out.write("               set_path($(target), source.data(\"xpath\"));\n");
      out.write("           } else if($(target).attr('id')==\"item_label_xpath\") {\n");
      out.write("               set_path($(target), source.data(\"xpath\"));\n");
      out.write("           } else if($(target).attr('id')==\"item_id_xpath\") {\n");
      out.write("        \t   if(source.attr(\"unique\") != \"true\") {\n");
      out.write("\t\t\t\tvar dialog = $('<div>')\n");
      out.write("\t\t\t\t.html('You used a field that does not contain unique values.')\n");
      out.write("\t\t\t\t.dialog({\n");
      out.write("\t\t\t\t\tautoOpen: true,\n");
      out.write("\t\t\t\t\tdialogClass: \"alert\",\n");
      out.write("\t\t\t\t\ttitle: 'Warning: Field does not contain unique value',\n");
      out.write("\t\t\t\t\tmodal: true,\n");
      out.write("\t\t\t\t});\n");
      out.write("        \t   } else { \n");
      out.write("          \t\t\tset_path($(target), source.data(\"xpath\"));\n");
      out.write("        \t   }\n");
      out.write("           }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    tree.selectNodeCallback = function(data) {\n");
      out.write("\t\t if(firstload==false){\n");
      out.write("\t    \t $K.kaiten('maximize',$('div[id^=\"kp\"]:last'));\n");
      out.write("    \t\t firstload=true;}\n");
      out.write("\n");
      out.write("    \t\tshowModal();\n");
      out.write("   \t    \n");
      out.write("\t\tvar xpathHolderId = data[0].data(\"xpathHolderId\");\n");
      out.write("\t\t\n");
      out.write("\t\t$('#dialog').valueBrowser({\n");
      out.write("\t\t\txpathHolderId: xpathHolderId\n");
      out.write("\t\t});\t\n");
      out.write("\t};\n");
      out.write("\t\n");
      out.write("\ttree.selectNodeCallback = function(data) {\n");
      out.write("\t\tvar xpath = data[0].data(\"xpath\");\n");
      out.write("\t\tvar xpathHolderId = data[0].data(\"xpathHolderId\");\n");
      out.write("\n");
      out.write("\t\tvar cp = $($(\"#source_tree\").closest('div[id^=kp]'));\n");
      out.write("\t\t$K.kaiten('removeChildren', cp, false);\n");
      out.write("\t\t\n");
      out.write("\t\tvar tokens = xpath.split(\"/\");\n");
      out.write("\t\tvar title = tokens[tokens.length - 1];\n");
      out.write("\t\t\t\n");
      out.write("\t\tpanel = $K.kaiten('load', {\n");
      out.write("\t\t\tkConnector:'html.string',\n");
      out.write("\t\t\tkTitle: title,\n");
      out.write("\t\t\thtml: \"\"\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tvar details = $(\"<div>\").css(\"padding\", \"10px\");\n");
      out.write("\t\tvar browser = $(\"<div>\").appendTo(details);\n");
      out.write("\t\t\n");
      out.write("\t\tpanel.find(\".panel-body\").before(details);\n");
      out.write("\t\tbrowser.valueBrowser({\n");
      out.write("\t\t\txpathHolderId: xpathHolderId\n");
      out.write("\t\t});\t\t\n");
      out.write("\t};\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$('#resetroot').click(function() {\n");
      out.write("\t\treset_paths();\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$('#doneroot').click(function() {\n");
      out.write("\t\t\tvar itemLevel = get_path($(\"#item_level_xpath\"));\n");
      out.write("\t\t\tvar itemLabel = get_path($(\"#item_label_xpath\"))\n");
      out.write("\t\t\tvar itemNativeId = get_path($(\"#item_id_xpath\"));\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif((itemLevel == undefined || itemLevel == \"\") ||  (itemLabel == undefined || itemLabel == \"\") && (itemNativeId == undefined || itemNativeId == \"\")) {\n");
      out.write("                var $dialog = $('<div></div>')\n");
      out.write("                .html('Item level and at least one of item label or item id must be set in order to proceed!')\n");
      out.write("                .dialog({\n");
      out.write("                        autoOpen: false,\n");
      out.write("                        title: 'Missing information',\n");
      out.write("                        buttons: {\n");
      out.write("                                Ok: function() {\n");
      out.write("                                        $( this ).dialog( \"close\" );\n");
      out.write("                                }\n");
      out.write("                        }\n");
      out.write("                });\n");
      out.write("                $dialog.dialog('open');\n");
      out.write("\t\t\t} else {\t\t\t\n");
      out.write("\t\t\t    $.ajax({\n");
      out.write("\t\t\t\t\turl: 'Itemize',\n");
      out.write("\t\t\t\t\tcontext: this,\n");
      out.write("\t\t\t\t\tdata: {\n");
      out.write("\t\t\t\t\t\tuploadId: uploadId,\n");
      out.write("\t\t\t\t\t\titemLevel: itemLevel,\n");
      out.write("\t\t\t\t\t\titemLabel: itemLabel,\n");
      out.write("\t\t\t\t\t\titemNativeId: itemNativeId \n");
      out.write("\t\t\t\t\t},\n");
      out.write("\t\t\t\t\tsuccess: function(o) {\n");
      out.write("\t\t\t\t\t\tvar panelcount=$('div[id^=\"kp\"]:last');\n");
      out.write("\t\t\t\t\t\tvar panelid=panelcount.attr('id');\n");
      out.write("\t\t\t\t\t\tvar pnum=parseInt(panelid.substring(2,panelid.length));\n");
      out.write("\t\t\t\t\t\tvar startpanel=$(\"#kp1\");\n");
      out.write("\t\t\t\t    \t$K.kaiten('slideTo',startpanel);\n");
      out.write("\t\t\t\t\t\tif(pnum>2){ \t\n");
      out.write("\t\t\t\t\t\t\tvar newpanel=$(\"#kp\"+(pnum-2).toString()); \t\n");
      out.write("\t\t\t\t\t\t\t$K.kaiten('reload',newpanel,{kConnector:'html.page', url:'ImportSummary.action?orgId='+");
      out.print(request.getParameter("orgId"));
      out.write("+'&userId='+");
      out.print(request.getParameter("userId"));
      out.write(", kTitle:'Dataset Options' });\n");
      out.write("\t\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\t\tvar newpanel=$(\"#kp1\");\n");
      out.write("\t\t\t\t\t\t\t$K.kaiten('reload',newpanel,{kConnector:'html.page', url:'ImportSummary.action?orgId='+");
      out.print(request.getParameter("orgId"));
      out.write("+'&userId='+");
      out.print(request.getParameter("userId"));
      out.write(", kTitle:'Dataset Options' });\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t}\t              \n");
      out.write("\t\t\t\t});\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\t});\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");

}
}

      out.write('\n');
      out.write('\n');
      out.write('\n');
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
