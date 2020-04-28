
package container.Fase;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Inimigo1 {
    private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;
	private int idInimigo;
	
	// private static final int LARGURA = 938;
	private static int VELOCIDADE = 2;
	
	public Inimigo1 (int x, int y, int idInimigo) {
		this.x = x;
		this.y = y;
		this.idInimigo = idInimigo;
		isVisivel = true;
	}
	
	public void load() {
		if (this.idInimigo == 1) {
			ImageIcon referencia = new ImageIcon("res\\garrafa12.png");
			imagem = referencia.getImage();
		} else if (this.idInimigo == 2){
			ImageIcon referencia = new ImageIcon("res\\papelao1.png");
			imagem = referencia.getImage();
		}else if (this.idInimigo == 3){
			ImageIcon referencia = new ImageIcon("res\\lata1.png");
			imagem = referencia.getImage();
		} else if (this.idInimigo == 4){
			ImageIcon referencia = new ImageIcon("res\\canudo1.png");
			imagem = referencia.getImage();
		}
		
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}//load
	
	public void update() {
		this.x -= VELOCIDADE;
		//if (this.x > LARGURA) {
			//isVisivel = false;
		//}//if
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, largura, altura);
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
}
