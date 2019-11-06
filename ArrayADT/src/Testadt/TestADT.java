/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testadt;

/**
 *
 * @author t7047098
 */
public class TestADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        ArrayADT array1 = new ArrayADT(5);
        System.out.println(array1.toString());

        array1.insert(3, 3);
        System.out.println(array1.toString());

        array1.insert(5, 3);
        System.out.println(array1.toString());

        array1.insert(2, 4);
        System.out.println(array1.toString());

        array1.insert(7, 1);
        System.out.println(array1.toString());

        int[] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        ArrayADT array2 = new ArrayADT(b);
        System.out.println(array2.toString());

        array2.remove(4);
        System.out.println(array2.toString());

        System.out.println(array2.retrieve(8));

        array2.increaseArraySize(15);
        System.out.println(array2.toString());

        int[] c = array2.copyArray();

        System.out.println(c.length);
        for (int i = 0; i < c.length; i++)
        	System.out.print(c[i] + " ");
        System.out.println();

        array2.destroy();
        if (array2.dataArray != null)
        	System.out.println("array of ADT was not destroyed !");
        else
        	System.out.println("array of ADT was destroyed as expected!");

        System.out.println(array2.toString());
    }
    
}
