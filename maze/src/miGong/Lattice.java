package miGong;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.util.Random;
	import java.util.Stack;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	class Lattice {//Ԫ��
	  static final int INTREE = 1;//��ʾ����������ɸı�ֵҲ�����Ըı����� 
	  static final int NOTINTREE = 0;//��ʾ����������ɸı�ֵҲ�����Ըı����� 
	  private int x = -1;
	  private int y = -1;
	  private int flag = NOTINTREE;
	  private Lattice father = null;
	  public Lattice(int xx, int yy) {
	    x = xx;
	    y = yy;
	  }
	  public int getX() {
	    return x;
	  }
	  public int getY() {
	    return y;
	  }
	  public int getFlag() {
	    return flag;
	  }
	  public Lattice getFather() {
	    return father;
	  }
	  public void setFather(Lattice f) {
	    father = f;
	  }
	  public void setFlag(int f) {
	    flag = f;
	  }
	  public String toString() {
	    return new String("(" + x + "," + y + ")\n");
	  }
	}