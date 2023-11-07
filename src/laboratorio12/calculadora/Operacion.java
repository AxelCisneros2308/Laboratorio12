/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio12.calculadora;

/**
 *
 * @author cristhian.cisneros
 */
public class Operacion {
    private CajaValidacion caja1;
    private CajaValidacion caja2;

    public Operacion(CajaValidacion valor1, CajaValidacion valor2) {
        this.caja1 = valor1;
        this.caja2 = valor2;
    }
    
  
    
    public float suma(){
        return this.caja1.getValor()+this.caja2.getValor();
    }
    
    public float resta(){
        return this.caja1.getValor()-this.caja2.getValor();
    }
    
    public float multi(){
        return this.caja1.getValor()*this.caja2.getValor();
    }
    
    public float division(){
        return this.caja1.getValor()/this.caja2.getValor();
    }
}
