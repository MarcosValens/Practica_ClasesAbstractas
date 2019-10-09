package figures;

import java.awt.Color;
import java.util.Objects;

public class Triangle extends FiguraGeometrica {
   private double base=0, altura=0;
   
   public Triangle (int ncodi, String nnom, Color ncolor, double nbase, double naltura) {
      super (ncodi, nnom, ncolor);
      if (nbase>0) base=nbase;
      if (naltura>0) altura=naltura;
   }

   public Triangle() {
   }
   
   public Triangle (Triangle r) {
      this (r.codi, r.nom, r.color, r.base, r.altura);
   }
   
   public void setBase (double novaBase) {
      if (novaBase>=0) base = novaBase;
   }

   public void setAltura (float novaAltura) {
      if (novaAltura>=0) altura = novaAltura;
   }

   public double getBase() {
      return base;
   }
   
   public double getAltura() {
      return altura;
   }

   @Override
   public double area () {
      return base*altura/2;
   }

   @Override
   public String toString() {
      return "Nom: "+nom+"\nColor: "+color+"\nCodi: "+codi;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Triangle)) return false;
      if (this.codi == ((Rectangle) o).codi) return true;
      Triangle triangle = (Triangle) o;
      return Double.compare(triangle.getBase(), getBase()) == 0 &&
              Double.compare(triangle.getAltura(), getAltura()) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(getBase(), getAltura());
   }

   public void visualitzar () {
      System.out.println ("S�c un triangle");
      System.out.println ("***************");
      super.visualitzar();
      System.out.println ("Base..........:" + base);
      System.out.println ("Altura........:" + altura);
      System.out.println ("�rea..........:" + area());
   }

   public static void main (String args[]) {
      Triangle t1 = new Triangle ();
      Triangle t2 = new Triangle (1, "figures.Triangle 1", Color.yellow, 3,4);
      t1.visualitzar();
      t2.visualitzar();
   }
}

