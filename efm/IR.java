package GestionEmploye;
public class IR {
	        private static double[] tranches = {0,28001,40001,50001,60001,150001};
	        private static double[] tauxIR = {0,0.12,0.24,0.34,0.38,0.40};
	        public static double getIR(double salaire)
	        {
	            for (int i = 1; i < 6; i++)
	            {
	                if (salaire < tranches[i])
	                    return tauxIR[i - 1];
	            }
	            return tauxIR[5];
	        }
	    } 

