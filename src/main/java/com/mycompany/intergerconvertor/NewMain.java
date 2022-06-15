/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.intergerconvertor;

/**
 *
 * @author 201971658
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		
		String convertedNo;
		int toBase = 0;
		try{
			
			System.out.println("Enter the number you want to convert");
			int num= input.nextInt();
		
			convertedNo = Integer.toString( num , toBase );
			System.out.println( "The converted number is " + convertedNo );
		}
		catch( Exception e )
		{
			System.out.println("Enter a valid number and try again");
			main(args);
		}
	}
}
    
    

