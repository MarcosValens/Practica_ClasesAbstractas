package figures;

import java.awt.Color;
import java.util.Objects;

public class Rectangle extends FiguraGeometrica {
   private double base=0, altura=0;
   
   public Rectangle (int ncodi, String nnom, Color ncolor, double nbase, double naltura) {
      super (ncodi, nnom, ncolor);
      if (nbase>0) base=nbase;
      if (naltura>0) altura=naltura;
   }

   public Rectangle() {
   }
   
   public Rectangle (Rectangle r) {
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
   
   public double perimetre () {
      return base*2+altura*2;
   }

   @Override
   public double area () {
      return base*altura;
   }

   @Override
   public String toString() {
      return "Nom: "+nom+"\nColor: "+color+"\nCodi: "+codi;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Rectangle)) return false;
      if (this.codi == ((Rectangle) o).codi) return true;
      Rectangle rectangle = (Rectangle) o;
      return Double.compare(rectangle.getBase(), getBase()) == 0 &&
              Double.compare(rectangle.getAltura(), getAltura()) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(getBase(), getAltura());
   }

   public void visualitzar () {
      System.out.println ("S�c un rectangle");
      System.out.println ("****************");
      super.visualitzar();
      System.out.println ("Base..........:" + base);
      System.out.println ("Altura........:" + altura);
      System.out.println ("Per�metre.....:" + perimetre());
      System.out.println ("�rea..........:" + area());
   }

   public static void main (String args[]) {
      Rectangle r1 = new Rectangle ();
      Rectangle r2 = new Rectangle (1, "figures.Rectangle 1", Color.green, 3,4);
      r1.visualitzar();
      r2.visualitzar();
   }
}