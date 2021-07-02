
package View;


public class TelaJogo extends TelaBase {
    
    public GamePanel gamePanel;
    
    public TelaJogo() {
        super("Jogo da Cobrinha - por Malu");
        this.gamePanel = new GamePanel();
        this.gamePanel.setBounds(0, 0, 640, 480);
        add(this.gamePanel);
       
      

    
       
    }
    
}
