package com.codegen;

import javax.jws.*;

@WebService()
public class WebServiceFTL
{

@WebMethod()
public ${return} ${methodname}(${params})
{
   ${body}
       return ${val}
}

}