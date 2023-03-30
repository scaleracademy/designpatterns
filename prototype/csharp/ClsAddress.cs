using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace prototype.csharp
{
    public class ClsAddress
    {
        public string strAddress = "";
        public ClsAddress getClone()
        {
            return (ClsAddress)this.MemberwiseClone();
        }
    }
}
