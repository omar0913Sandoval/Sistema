/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.Clinica.Controller;

import ni.edu.uni.Clinica.Model.Medico;

/**
 *
 * @author franc
 */
public class MedicoController {
    
    
     public static void IngresarCliente(String a, String b, String c, String d, String e, String f, String g, String h, String i) throws Exception
    {
        if(a.equals("") || a == null ||
                b.equals("") || b == null ||
                c.equals("") || c == null ||
                d.equals("") || d == null ||
                e.equals("") || e == null ||
                f.equals("") || f == null ||
                g.equals("") || g == null ||
                h.equals("") || h == null||
                i.equals("") || i == null
                
                )
        {
            System.out.println("No se pueden guardar los datos, verificar que ningún campo este vacío.");

        }
        else
        {
            boolean v = false;

        /*    for(String s :Cliente.cedulasRegistradas())
            {
                if(s.equals(e))
                {
                    v = true;
                }
            }*/

        /*    if(v ==  true)
            {
                msgerr("Ya existe ese número de cedula.");
            }
            else {*/
                Medico medico = new Medico(a, b, c, d, e, f, g, h, i);
                medico.IngresarCliente(medico);
                System.out.println("Alegre sirvio..");
           // }
        }
    }
    
}
