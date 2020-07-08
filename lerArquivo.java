public static void main(String[] args) throws IOException {
			
			   BufferedReader br = new BufferedReader(new		 
			   FileReader("C:\\HOMEPATH\\data\\in\\exemplo.txt"));
			   String linha="";
			   
			   
			   while ((linha = br.readLine()) != null) {
				   
				   String[] t = linha.split (Pattern.quote ("ç"));
				   String valida = linha.substring(0,3);
				   
				   if(valida.contentEquals("001")){
					   
					   for(String value: t) {
						   if(value.length()> 0) 
						   {
						      String nome = t[0];
						      System.out.println(nome);
						      
						      
						      
						   }else {
							  System.out.println("Linha em branco");
						         } }
					       }else if(valida.contentEquals("002")){
						       for(String value: t) {
						    	   if(value.length()> 0) {
						    		   String nome = t[0];
									   System.out.println(nome);
						    		   
						    	   }
							      
						   }
						      
			               }else if(valida.contentEquals("003")) {
			            	   for(String value: t) {
			            		   String nome = t[0];
								   System.out.println(nome);
			            	}
			            }
			   
			}
				  
				  	
				
	}}
