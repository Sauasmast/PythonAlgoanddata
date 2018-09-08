
package interview.practice;

/**
 *
 * 
 */
class Arrayclass {
    
    private int[] arrays;
    
    Arrayclass(int[] arrays){
        this.arrays = arrays;
    }
    
    public int[] getIntegers(){
        return this.arrays;
    }
    
    public void printArray(){
        for (int ele: this.arrays){
            System.out.println(ele);
        }
    }
    
    //Overloading the method
     public void printArray(int[] arrays){
        for (int ele: arrays){
            System.out.println(ele);
        }
    }
    
    public void sortIntegers(){
        
        // Creating a deepcopy of an array. 
        int[] newarray = new int[this.arrays.length]; 
        for (int i =0; i<=newarray.length-1; i++){
            newarray[i] = this.arrays[i];
            }
        // Using the bubble sort to sort the array 
        for (int i=0; i<=newarray.length-1; i++){
            int swapping = 0;
            for (int j=0; j<=newarray.length-2; j++){
                if (newarray[j]<newarray[j+1]){
                    int swapping_array = newarray[j+1];
                    newarray[j+1] = newarray[j];
                    newarray[j] = swapping_array;
                    swapping++;
                }
            }
                if (swapping == 0){
                  break;
                }
                else{
                    continue;
                }
            }
        printArray(newarray);
        }
    
    } 