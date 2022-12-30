package mahamed.librarymanagementsystem;

/**
 *
 * @author Mahamed
 */
public class Module2 {
    public void chemistry(){
        
        System.out.println("");
        String chem[] = {"Organic Chemistry", "Physical Chemistry", "Polymer Chemistry"};
        
        System.out.println("The books available in chemistry department are as follow:");
        for (int i=0; i< chem.length; i++){
            System.out.println(chem[i]);
        }
    }
    
    public void physics(){
        
        System.out.println("");
        String phy[] = {"Solid State Physics", "Astro Physics", "Dynamics", "Mechanics"};
        
        System.out.println("The books available in physics department are as follow:");
        for (int j=0; j< phy.length; j++){
            System.out.println(phy[j]);
        }
    }
    
    public void biology(){
        
        System.out.println("");
        String bio[] = {"Medical Science", "Zoology", "Botany"};
        
        System.out.println("The books available in Biolofy department are as follow:");
        for (int b=0; b< bio.length; b++){
            System.out.println(bio[b]);
        }
    }
}
