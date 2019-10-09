package figures;

import java.awt.Color;

public abstract class FiguraGeometrica {
   protected int codi=0;
   protected String nom="";
   protected Color color=Color.white;

   public FiguraGeometrica (int ncodi, String nnom, Color ncolor) {
      if (ncodi>0) codi = ncodi;
      nom = nnom;
      color = ncolor;
   }

   public FiguraGeometrica(FiguraGeometrica f)  {
      this (f.codi, f.nom, f.color);
   }

   public FiguraGeometrica () {}

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setNom (String nouNom)  {
      nom = nouNom;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }   

   public int getCodi () {
      return codi;
   }

   public String getNom () {
      return nom;
   }
   
   public Color getColor () {
      return color;
   }

   public void visualitzar () {
      System.out.println ("Codi..........:" + codi);
      System.out.println ("Nom...........:" + nom);
      System.out.println ("Color.........:" + color);
   }

   public abstract double area ();

   public static void main(String args[]) {
      /*figures.FiguraGeometrica f1 = new figures.FiguraGeometrica();
      figures.FiguraGeometrica f2 = new figures.FiguraGeometrica(1,"figures.FiguraGeometrica 1", Color.orange);
      f1.visualitzar();
      f2.visualitzar();*/
   }
}

/*
* Milloreu la implementació amb les característiques següents:
- La classe figures.FiguraGeometrica ha de passar a ser abstracta i ha de fer que qualsevol classe derivada implementi
  obligatòriament el mètode area() per calcular l’àrea de la figura corresponent. Quin canvi cal efectuar en la
  figura anterior?

* En figures.FiguraGeometrica, una vez hecha la clase abstracta, he tenido que implementar un metodo area(), tambien abstracto,
  para que las clases hijas, estuvieran obligadas a heredar el metodo, ademas en el metodo area() de todas las clases
  hijas he tenido que poner @Override

- Cal sobreescriure els mètodes toString(), equals() heretats de la classe Object.
- Cal considerar que dues figures geomètriques són iguals si tenen el mateix codi.
- Cal incloure totes les classes de la jerarquia en un paquet anomenat figures.

 Desenvolupeu una altra classe, anomenada ProvaFigures, pertanyent a un paquet anomenat proves, que contingui un mètode
 main() per comprovar la gestió correcta de les classes figures.FiguraGeometrica i derivades implementades. La presència
 d’aquesta classe no prohibeix que cada classe tingui el propi mètode main() per comprovar-ne el funcionament.
*/