package com.mycompany.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author Administrador
 */
public class GenericAction {

    @Action(value = "index", results
            = @Result(name = "success", location = "/Home.jsp"))
    public String index() {
        return "success";
    }
}
