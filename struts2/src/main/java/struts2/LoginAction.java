package struts2;


import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/User")
@ResultPath(value="/")
@Result(name="success",location="/login.jsp")
public class LoginAction extends ActionSupport{

}