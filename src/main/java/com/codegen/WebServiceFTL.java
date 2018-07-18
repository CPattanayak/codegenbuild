package com.codegen;

import javax.jws.*;

@WebService()
public class WebServiceFTL
{

@WebMethod()
public String getResult(String name)
{
   String res= "Hi Chandan"  ;
 System.out.println(res);
       return res;
}

}