package tresenraya;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.MetalButtonUI;

public class LogicaJuego {
    int turno=1, pX, pO; // Turno del jugador
    boolean habilitado; // Habilita y deshabilita el tablero
    int count;
    /**
     * Inicializaremos el juego con las siguientes variables_
     * @param turno (Nos indicará el turno del jugador: 0 - X, 1 - O)
     * @param pX (Contiene el valor total de las victorias de este jugador)
     * @param pO (Contiene el valor total de las victorias de este jugador)
     */
    public LogicaJuego(int turno, int pX, int pO) {
        this.turno = turno;
        this.pX = pX;
        this.pO = pO;
    }

    /**
     * Obtener turno
     * @return 
     */
    public int getTurno() {
        return turno;
    }

    /**
     * Insertar turno
     * @param turno 
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getpX() {
        return pX;
    }

    public void setpX(int pX) {
        this.pX = pX;
    }

    public int getpO() {
        return pO;
    }

    public void setpO(int pO) {
        this.pO = pO;
    }
    
    /**
     * Llamaremos a este método para cambiar de turno
     */
    public int cambioTurno(){
        // Inserta código aquí...
    	// change turn
    	 if(turno==1)
 	    {
 	    	turno=2;
 	    }
 	    else
 	    {
 	    	turno=1;
 	    }
    	 System.out.println(turno+"---turn");
    	 return turno;
        
    }
    
    /**
     * Comprobar si se ha conseguido un tres en raya, 
     * en caso que se haya conseguido devolverá 1, en caso contrario retorna 0 y continúa el juego
     * @param matriz (Tablero de juego)
     * @return 
     */
    public int comprobarJuego(int matriz[][]){
        // Inserta código aquí...
        
        // Comprobar si existe tres en raya
        // Comprobar horizontal
        
        //Comprobar vertical
        
        //Comprobar en diagonal
        
        // Si no hay tres en raya
        return 0;
    }
    
    /**
     * Deshabilitará el botón para evitar que se vuelva a posicionar una ficha en ese hueco
     * @param bt (Botón seleccionado)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     * @return 
     */
    public int tiradaJugador(javax.swing.JButton bt, int x, int y, int matriz[][], javax.swing.JPanel jp, javax.swing.JLabel lX, javax.swing.JLabel lO){
    	count++;
    	System.out.println(x+"--x---y-"+y);
    	  Juego JuegObject=new Juego();
    	  bt.setUI(new MetalButtonUI() {
    		    protected Color getDisabledTextColor() {
    		        return Color.RED;
    		    }
    		});
    	 bt.setEnabled(false);
    	       cambioTurno();
    		   pintarFicha(bt);
    		   ponerFicha(matriz,x,y, bt);
    		   boolean result=checkVictoryCondition(x,y,matriz);
    		   System.out.println(result);
    		   if(result)
        	   {
        	    JOptionPane.showMessageDialog(null, "Player "+turno+" Wins");
        	    JuegObject.clearButtons();
        	    if(turno==1)
        	    {	pX++;
        	    System.out.println("px--"+pX);
        	  //  JuegObject.pO.setText("HAHAH");
        	//    lX.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        	    lX.setText(String.valueOf(pX));
        	    }
        	    else
        	    	{pO++;
        	    	System.out.println("pO---"+pO);
        	    lO.setText(String.valueOf(pO));

        	    	}
        	   }
    	   if(count==9)
    	   {
    	    JOptionPane.showMessageDialog(null, "Match is a draw!");
    	 
    	   }
    	// Inserta código aquí...
        
        // Deshabilita el botón
        
        // Insertar la ficha en el botón
               
        // Comprobar si se ha ganado la partida
         
         // Deshabilitar tablero
         return 0;
    }
    
    boolean checkVictoryCondition(int x,int y,int matriz[][])
    {
    if(matriz[x][y]!=0)
    {
     Integer a=x;
     Integer b=y;
     int i;
   
     //check row
     for(i=0;i<3;i++)  {
      if((matriz[a][i])!=matriz[a][b])
       break;
     }
     if(i==3)
      return true;
   
     //check column
     for(i=0;i<3;i++)  {
      if(matriz[i][b]!=matriz[a][b])
       break;
     }
     if(i==3)
      return true;
   
     //check diagonal
     if((a==2&&b==2)||(a==0&&b==0)||(a==1&&b==1)||(a==0&&b==2)||(a==2&&b==0))
     {
      //left diagonal
      for(i=0;i<3;i++)
      	if(matriz[i][i]!=matriz[a][b])
      		break;
      if(i==3)
       return true;
   
      //right diagonal
      if((matriz[0][2]==matriz[a][b])&&(matriz[1][1]==matriz[a][b])&&(matriz[2][0]==matriz[a][b]))
       return true;
   
      }
   
     return false;
    }
    else return false;
    }
    /**
     * Actualizar la puntuación de cada jugador al ganar la partida
     * Al finalizar el incremento de puntuación es necesario cambiar de turno
     * @param lX (JLabel del jugador X)
     * @param lO (JLabel del jugador O)
     */
    public void ganador(javax.swing.JLabel lX, javax.swing.JLabel lO){
        // Inserta código aquí...
        
        // Incrementa jugador ganador e inserta resultado en jLabel    
 
    }
    
    /**
     * Habilitará o deshabilitará el tablero dependiendo del estado de la variable habilitado
     * @param jp  (Panel dónde se sitúa el tablero de juego)
     */
    public void habilitarTablero( javax.swing.JPanel jp){
        // Inserta código aquí...
        // Bloquea todos los elementos del JPanel
        
    }
    
    /**
     * Insertaremos la ficha en la posición correspondiente de la matriz
     * Llamaremos al método pintarFicha
     * @param matriz (Tablero de juego)
     * @param t (Turno)
     * @param x (Posición x en el tablero)
     * @param y (Posición y en el tablero)
     * @param bt (Botón pulsado)
     */
    public void ponerFicha(int matriz[][], int x, int y, javax.swing.JButton bt){
    	
    	if(turno==1)
    	matriz[x][y]=1;
    	else
    		matriz[x][y]=2;	
        // Inserta código aquí...        

        // Insertar ficha en la posición de la matriz
        
    }
    
    /**
     * Pintará la ficha en el tablero de juego visual, es decir, en el botón
     * @param bt (Botón pulsado)
     */
    private void pintarFicha(javax.swing.JButton bt){
        // Inserta código aquí...
        // Si el turno es de 0 pintará una X en rojo

         // Si el turno es de 1, pintará una O en azul 
    	if(turno==1) {
    		bt.setText("X");
    		 bt.setUI(new MetalButtonUI() {
     		    protected Color getDisabledTextColor() {
     		        return Color.white;
     		    }
     		});
    		bt.setBackground(new java.awt.Color(255, 0, 0));
    	}
        	else {
        		bt.setText("O");
        		 bt.setUI(new MetalButtonUI() {
          		    protected Color getDisabledTextColor() {
          		        return Color.white;
          		    }
          		});
        		bt.setBackground(new java.awt.Color(44, 0, 7));
        	}
    }
    
    /**
     * Inicializa una nueva partida, reinicia la matriz (Tablero de juego) y habilita el tablero
     * 
     * ¡¡¡¡No es necesario modificar este método!!!!.
     * 
     * @param matriz (Tablero de juego)
     * @param jp (Panel dónde se sitúa el tablero de juego)
     */
    public void iniciarPartida(int matriz[][], javax.swing.JPanel jp){
        // Rellenamos la matriz por primera vez, evitando que se repitan los números
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                matriz[x][y]=(x+10)*(y+10);
            }
        }

        // Habilitar tablero
         habilitado = true;
         habilitarTablero(jp);
    }
}
