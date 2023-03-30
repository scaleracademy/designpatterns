using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace prototype.csharp
{
    public class ClsCustomer
    {
        public ClsAddress objAddress = new ClsAddress();
        public string strCustomerCode = "";
        public string strCustomerName = "";

        public ClsCustomer getClone()
        {
            ClsCustomer cust;
            cust = (ClsCustomer)this.MemberwiseClone();
            cust.objAddress = objAddress.getClone();
            return cust;
        }
    }
}
