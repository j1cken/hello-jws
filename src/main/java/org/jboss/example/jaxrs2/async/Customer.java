package org.jboss.example.jaxrs2.async;

import java.io.Serializable;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class Customer implements Serializable
{
   private static final long serialVersionUID = 7096087634743116943L;
   private String name;

   public Customer()
   {
   }

   public Customer(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
}
