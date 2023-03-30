using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace prototype.csharp
{
    public class Program
    {
        public static void Main(string[] args)
        {
            ClsCustomer cs1 = new ClsCustomer();
            cs1.strCustomerCode = "001";
            cs1.strCustomerName = "Old Customer";
            ClsAddress ca1 = new ClsAddress();
            ca1.strAddress = "India";
            cs1.objAddress = ca1;

            ClsCustomer cs2;
            cs2 = cs1.getClone();
            cs2.strCustomerName = "New Customer";
        }
    }
}
