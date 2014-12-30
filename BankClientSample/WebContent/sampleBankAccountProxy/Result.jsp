<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBankAccountProxyid" scope="session" class="bank.BankAccountProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBankAccountProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleBankAccountProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleBankAccountProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        bank.BankAccount getBankAccount10mtemp = sampleBankAccountProxyid.getBankAccount();
if(getBankAccount10mtemp == null){
%>
<%=getBankAccount10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String amount_1id=  request.getParameter("amount18");
        double amount_1idTemp  = Double.parseDouble(amount_1id);
        String currencyIn_2id=  request.getParameter("currencyIn20");
            java.lang.String currencyIn_2idTemp = null;
        if(!currencyIn_2id.equals("")){
         currencyIn_2idTemp  = currencyIn_2id;
        }
        String currencyOut_3id=  request.getParameter("currencyOut22");
            java.lang.String currencyOut_3idTemp = null;
        if(!currencyOut_3id.equals("")){
         currencyOut_3idTemp  = currencyOut_3id;
        }
        double convert15mtemp = sampleBankAccountProxyid.convert(amount_1idTemp,currencyIn_2idTemp,currencyOut_3idTemp);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(convert15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 24:
        gotMethod = true;
        String amount_4id=  request.getParameter("amount27");
        double amount_4idTemp  = Double.parseDouble(amount_4id);
        String currencyName_5id=  request.getParameter("currencyName29");
            java.lang.String currencyName_5idTemp = null;
        if(!currencyName_5id.equals("")){
         currencyName_5idTemp  = currencyName_5id;
        }
        boolean pay24mtemp = sampleBankAccountProxyid.pay(amount_4idTemp,currencyName_5idTemp);
        String tempResultreturnp25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(pay24mtemp));
        %>
        <%= tempResultreturnp25 %>
        <%
break;
case 31:
        gotMethod = true;
        String amount_6id=  request.getParameter("amount34");
        double amount_6idTemp  = Double.parseDouble(amount_6id);
        String currencyName_7id=  request.getParameter("currencyName36");
            java.lang.String currencyName_7idTemp = null;
        if(!currencyName_7id.equals("")){
         currencyName_7idTemp  = currencyName_7id;
        }
        sampleBankAccountProxyid.credit(amount_6idTemp,currencyName_7idTemp);
break;
case 38:
        gotMethod = true;
        double getBalance38mtemp = sampleBankAccountProxyid.getBalance();
        String tempResultreturnp39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getBalance38mtemp));
        %>
        <%= tempResultreturnp39 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>