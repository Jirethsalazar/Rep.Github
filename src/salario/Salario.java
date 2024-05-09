package salario;

import javax.swing.JOptionPane;


public class Salario {

    /**
     * Determinar la cantidad de empleados de una empresa que ganan
     * un salario superior al salario promedio de todos los empleados 
     * de la empresa
     */
    public static void main(String[] args) {
        // 1.Calcular el salario promedio
        double salario[];
        double sumaSalario=0, salarioPromedio;
        int cantEmp=0, totalEmpleados;
        totalEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de empleados"));
        salario=new double[totalEmpleados];
        for(int i=0; i<totalEmpleados;i++){
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el salario del empleado"));
            sumaSalario=sumaSalario+salario[i];
        }
        salarioPromedio=sumaSalario/totalEmpleados;
        System.out.println("El salario promedio es :"+salarioPromedio );
        
        // 2.Determinar cuantos Empleados ganan un salario superior 
        
        for(int i=0; i<totalEmpleados; i++){
            salario[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingresar el salario del empleado"));
            if(salario[i] >salarioPromedio){
                
                cantEmp=cantEmp+1;
            }
            JOptionPane.showInputDialog(null, "El numero de Empleados con salario superior al promedio es: "+cantEmp);
        }
    }
    
}
