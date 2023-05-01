package project;

import java.io.IOException;
import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MapController {
    int count1 = 0;
    int count2 = 0;
    int rowIndex1 = 0;
    int columnIndex1 = 0;
    int rowIndex2 = 0;
    int columnIndex2 = 0;
    int money1 = 100000;
    int money2 = 100000;
    int money = 1000;
    ArrayList<Integer> housecount = new ArrayList<>(32);
    ArrayList<Integer> traincount = new ArrayList<>(3);
    int housemoney = 500;
    int dice = 0;
    int turn = 0;
    int second = 10;   
    int prisonturn1 =0;
    int hospitalturn1 = 0;
    int prisonturn2 =0;
    int hospitalturn2 = 0;
    boolean prisonflag1;
    boolean hospitalflag1 ;
    boolean prisonflag2;
    boolean hospitalflag2 ;
    @FXML
    private Pane p2, p1;
    @FXML
    private GridPane map;
    @FXML
    private Button roll1,roll2;
    @FXML
    private TextField num;
    @FXML
    private Label buy;
    @FXML
    private Label m1;
    @FXML
    private Label m2;
    @FXML
    private RadioButton Y;
    @FXML
    private RadioButton N;
    @FXML
    private Button check1;
    @FXML
    private Button build1;
    @FXML
    private Button check2;
    @FXML
    private Button build2;
    @FXML
    private ToggleGroup YorN;
    @FXML
    private Label l1_2;
    @FXML
    private Label l2_2;
    @FXML
    private Label h_2;
    @FXML
    private Label l1_3;
    @FXML
    private Label l2_3;
    @FXML
    private Label h_3;
    @FXML
    private Label l1_4;
    @FXML
    private Label l2_4;
    @FXML
    private Label l1_5;
    @FXML
    private Label l2_5;
    @FXML
    private Label h_5;
    @FXML
    private Label l1_7;
    @FXML
    private Label l2_7;
    @FXML
    private Label h_7;
    @FXML
    private Label l1_9;
    @FXML
    private Label l2_9;
    @FXML
    private Label h_9;
    @FXML
    private Label l1_10;
    @FXML
    private Label l2_10;
    @FXML
    private Label h_10;
    @FXML
    private Label l1_11;
    @FXML
    private Label l2_11;
    @FXML
    private Label h_11;
    @FXML
    private Label l1_12;
    @FXML
    private Label l2_12;
    @FXML
    private Label l1_13;
    @FXML
    private Label l2_13;
    @FXML
    private Label h_13;
    @FXML
    private Label l1_15;
    @FXML
    private Label l2_15;
    @FXML
    private Label h_15;
    @FXML
    private Label l1_16;
    @FXML
    private Label l2_16;
    @FXML
    private Label h_16;
    @FXML
    private Label l1_18;
    @FXML
    private Label l2_18;
    @FXML
    private Label h_18;
    @FXML
    private Label l1_19;
    @FXML
    private Label l2_19;
    @FXML
    private Label h_19;
    @FXML
    private Label l1_20;
    @FXML
    private Label l2_20;
    @FXML
    private Label l1_21;
    @FXML
    private Label l2_21;
    @FXML
    private Label h_21;
    @FXML
    private Label l1_23;
    @FXML
    private Label l2_23;
    @FXML
    private Label h_23;
    @FXML
    private Label l1_25;
    @FXML
    private Label l2_25;
    @FXML
    private Label h_25;
    @FXML
    private Label l1_27;
    @FXML
    private Label l2_27;
    @FXML
    private Label h_27;
    @FXML
    private Label l1_28;
    @FXML
    private Label l2_28;
    @FXML
    private Label l1_29;
    @FXML
    private Label l2_29;
    @FXML
    private Label h_29;
    @FXML
    private Label l1_30;
    @FXML
    private Label l2_30;
    @FXML
    private Label h_30;
    @FXML
    private Label l1_31;
    @FXML
    private Label l2_31;
    @FXML
    private Label h_31;
    @FXML
    private Label event1;
    @FXML
    private Label event2;
    @FXML
    private Label GO1;
    @FXML
    private Label GO2;
    @FXML
    private Label time;
    @FXML
    private Button game;

    @FXML
	public void onExitPressed() throws IOException{
		Parent menu = FXMLLoader.load(getClass().getResource("menu.fxml"));
		Scene menuScene = new Scene(menu);
		menuScene.getRoot().requestFocus();
		Game.currentStage.setScene(menuScene);
	}
    
    @FXML
	public void onOptionsPressed() throws IOException{
    	Stage stage=new Stage();  
        Parent root = FXMLLoader.load(Thread.currentThread().getContextClassLoader().getResource("Options1.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
	}
    
    public void game() {
        for(int i = 0; i < 32; i++) {
            housecount.add(0);
        }
        for(int j = 0; j < 3; j++) {
        	traincount.add(0);
        }
    }
    
    public void gameover() {
    	if(money1 <= 0) {
    		GO1.setVisible(true);
    		GO2.setVisible(true);
    		GO1.setText("LOSE!");
    		GO2.setText("WIN!");
    		game.setVisible(true);
    		roll1.setDisable(true);
    		roll2.setDisable(true);
    	}
    	if(money2 <= 0) {
    		GO1.setVisible(true);
    		GO2.setVisible(true);
    		GO2.setText("LOSE!");
    		GO1.setText("WIN!");
    		game.setVisible(true);
    		roll1.setDisable(true);
    		roll2.setDisable(true);
    	}
    	if(turn >= 200) {
    		if(money1 < money2) {
    			GO1.setVisible(true);
        		GO2.setVisible(true);
        		GO1.setText("LOSE!");
        		GO2.setText("WIN!");
        		game.setVisible(true);
        		roll1.setDisable(true);
        		roll2.setDisable(true);
    		}
    		if(money1 > money2) {
    			GO1.setVisible(true);
        		GO2.setVisible(true);
        		GO2.setText("LOSE!");
        		GO1.setText("WIN!");
        		game.setVisible(true);
        		roll1.setDisable(true);
        		roll2.setDisable(true);
    		}
    		else {
    			GO1.setVisible(true);
        		GO2.setVisible(true);
        		GO1.setText("TIE!");
        		GO2.setText("TIE!");
        		game.setVisible(true);
        		roll1.setDisable(true);
        		roll2.setDisable(true);
    		}
    	}
    }
    
    public void warningprison() {
    	if(prisonflag1 == false) {
    		event1.setText("坐牢中");
    		event1.setVisible(true);
    	}
    	if(prisonflag1 == true) {
    		event1.setVisible(false);
    	}
    	if(prisonflag2 == false) {
    		event2.setText("坐牢中");
    		event2.setVisible(true);
    	}
    	if(prisonflag2 == true) {
    		event2.setVisible(false);
    	}
    }
    
    public void warninghospital() {
    	if(hospitalflag1 == false) {
    		event1.setText("治療中");
    		event1.setVisible(true);
    	}
    	if(hospitalflag1 == true) {
    		event1.setVisible(false);
    	}
    	if(hospitalflag2 == false) {
    		event2.setText("治療中");
    		event2.setVisible(true);
    	}
    	if(hospitalflag2 == true) {
    		event2.setVisible(false);
    	}
    }

    public void rollthedice1() {
    	roll2.setVisible(true);
        if(turn==0){
            prisonflag1=true;
            hospitalflag1=true;
            prisonflag2=true;
            hospitalflag2=true;
        }
        turn++;
        if(prisonturn1 ==turn){
            prisonflag1 =true;
        }
        if(hospitalturn1 ==turn){
            hospitalflag1 =true;
        }
        if(prisonflag1 ==true&& hospitalflag1 ==true){
            if(roll1.isDisabled() == false && roll2.isDisabled() == false) {
                game();
            }
            dice = (int)(Math.random()*10 + 1);
            num.setText(String.valueOf(dice));
            Timeline walk = new Timeline(new KeyFrame(Duration.millis(400),(e)->{
                count1++;
                if(count1 == 32) {
                    count1 -= 32;
                }
                move1();
            }));
            walk.setCycleCount(dice);
            walk.play();


            Timeline Buy = new Timeline(new KeyFrame(Duration.millis(400*dice + 1),(e)->{
                decide();
            }));
            Buy.play();

        } 
        roll1.setDisable(true);
        roll2.setDisable(true);
        second = 10;
        Timeline O = new Timeline(new KeyFrame(Duration.millis(400*dice),(e)->{
        	Timeline think = new Timeline(new KeyFrame(Duration.millis(1000),(E)->{
            	time.setVisible(true);
            	time.setText(second + "秒");
            	second--;
            	time.setText(second + "秒");
            	if(second == 0) {
            		time.setVisible(false);
            	}
            }));
        	think.setCycleCount(10);
        	think.play();
        }));
        O.play();
        Timeline R = new Timeline(new KeyFrame(Duration.millis(400*dice + 10000),(e)->{
        	roll2.setDisable(false);
            gameover();
            warningprison();
            warninghospital();
        }));
        R.play();
    }

    public void rollthedice2() {
    	if(turn==0){
            prisonflag1=true;
            hospitalflag1=true;
            prisonflag2=true;
            hospitalflag2=true;
        }
    	turn++;
        if(prisonturn2 ==turn){
            prisonflag2 =true;
        }
        if(hospitalturn2 ==turn){
            hospitalflag2 =true;
        }
        if (prisonflag2==true&&hospitalflag2==true){
            if(roll1.isDisabled() == false && roll2.isDisabled() == false) {
                game();
            }
            dice = (int)(Math.random()*10 + 1);
            num.setText(String.valueOf(dice));
            Timeline walk = new Timeline(new KeyFrame(Duration.millis(400),(e)->{
                count2++;
                if(count2 == 32) {
                    count2 -= 32;
                }
                move2();
            }));
            walk.setCycleCount(dice);
            walk.play();

            Timeline Buy = new Timeline(new KeyFrame(Duration.millis(400*dice + 1),(e)->{
                decide();
            }));
            Buy.play();

        }
        roll2.setDisable(true);
        roll1.setDisable(true);
        second = 10;
        Timeline O = new Timeline(new KeyFrame(Duration.millis(400*dice),(e)->{
        	Timeline think = new Timeline(new KeyFrame(Duration.millis(1000),(E)->{
            	time.setVisible(true);
            	time.setText(second + "秒");
            	second--;
            	time.setText(second + "秒");
            	if(second == 0) {
            		time.setVisible(false);
            	}
            }));
        	think.setCycleCount(10);
        	think.play();
        }));
        O.play();
        Timeline R = new Timeline(new KeyFrame(Duration.millis(400*dice + 10000),(e)->{
        	roll1.setDisable(false);
            gameover();
            warningprison();
            warninghospital();
        }));
        R.play();
    }

    public void move1() {
        if(count1 == 0) {
            rowIndex1 = 8;
            columnIndex1 = 0;
            money1 += 2000;
            m1.setText(String.valueOf(money1));
        }
        if(count1 == 1) {
            rowIndex1 = 8;
            columnIndex1 = 1;
        }
        if(count1 == 2) {
            rowIndex1 = 8;
            columnIndex1 = 2;
        }
        if(count1 == 3) {
            rowIndex1 = 8;
            columnIndex1 = 3;
        }
        if(count1 == 4) {
            rowIndex1 = 8;
            columnIndex1 = 4;
        }
        if(count1 == 5) {
            rowIndex1 = 8;
            columnIndex1 = 5;
        }
        if(count1 == 6) {
            rowIndex1 = 8;
            columnIndex1 = 6;
        }
        if(count1 == 7) {
            rowIndex1 = 8;
            columnIndex1 = 7;
        }
        if(count1 == 8) {
            rowIndex1 = 8;
            columnIndex1 = 8;
        }
        if(count1 == 9) {
            rowIndex1 = 7;
            columnIndex1 = 8;
        }
        if(count1 == 10) {
            rowIndex1 = 6;
            columnIndex1 = 8;
        }
        if(count1 == 11) {
            rowIndex1 = 5;
            columnIndex1 = 8;
        }
        if(count1 == 12) {
            rowIndex1 = 4;
            columnIndex1 = 8;
        }
        if(count1 == 13) {
            rowIndex1 = 3;
            columnIndex1 = 8;
        }
        if(count1 == 14) {
            rowIndex1 = 2;
            columnIndex1 = 8;
        }
        if(count1 == 15) {
            rowIndex1 = 1;
            columnIndex1 = 8;
        }
        if(count1 == 16) {
            rowIndex1 = 0;
            columnIndex1 = 8;
        }
        if(count1 == 17) {
            rowIndex1 = 0;
            columnIndex1 = 7;
        }
        if(count1 == 18) {
            rowIndex1 = 0;
            columnIndex1 = 6;
        }
        if(count1 == 19) {
            rowIndex1 = 0;
            columnIndex1 = 5;
        }
        if(count1 == 20) {
            rowIndex1 = 0;
            columnIndex1 = 4;
        }
        if(count1 == 21) {
            rowIndex1 = 0;
            columnIndex1 = 3;
        }
        if(count1 == 22) {
            rowIndex1 = 0;
            columnIndex1 = 2;
        }
        if(count1 == 23) {
            rowIndex1 = 0;
            columnIndex1 = 1;
        }
        if(count1 == 24) {
            rowIndex1 = 0;
            columnIndex1 = 0;
        }
        if(count1 == 25) {
            rowIndex1 = 1;
            columnIndex1 = 0;
        }
        if(count1 == 26) {
            rowIndex1 = 2;
            columnIndex1 = 0;
        }
        if(count1 == 27) {
            rowIndex1 = 3;
            columnIndex1 = 0;
        }
        if(count1 == 28) {
            rowIndex1 = 4;
            columnIndex1 = 0;
        }
        if(count1 == 29) {
            rowIndex1 = 5;
            columnIndex1 = 0;
        }
        if(count1 == 30) {
            rowIndex1 = 6;
            columnIndex1 = 0;
        }
        if(count1 == 31) {
            rowIndex1 = 7;
            columnIndex1 = 0;
        }
        GridPane.setRowIndex(p1, rowIndex1);
        GridPane.setColumnIndex(p1,columnIndex1);
    }

    public void move2() {
        if(count2 == 0) {
            rowIndex2 = 8;
            columnIndex2 = 0;
            money2 += 2000;
            m2.setText(String.valueOf(money2));
        }
        if(count2 == 1) {
            rowIndex2 = 8;
            columnIndex2 = 1;
        }
        if(count2 == 2) {
            rowIndex2 = 8;
            columnIndex2 = 2;
        }
        if(count2 == 3) {
            rowIndex2 = 8;
            columnIndex2 = 3;
        }
        if(count2 == 4) {
            rowIndex2 = 8;
            columnIndex2 = 4;
        }
        if(count2 == 5) {
            rowIndex2 = 8;
            columnIndex2 = 5;
        }
        if(count2 == 6) {
            rowIndex2 = 8;
            columnIndex2 = 6;
        }
        if(count2 == 7) {
            rowIndex2 = 8;
            columnIndex2 = 7;
        }
        if(count2 == 8) {
            rowIndex2 = 8;
            columnIndex2 = 8;
        }
        if(count2 == 9) {
            rowIndex2 = 7;
            columnIndex2 = 8;
        }
        if(count2 == 10) {
            rowIndex2 = 6;
            columnIndex2 = 8;
        }
        if(count2 == 11) {
            rowIndex2 = 5;
            columnIndex2 = 8;
        }
        if(count2 == 12) {
            rowIndex2 = 4;
            columnIndex2 = 8;
        }
        if(count2 == 13) {
            rowIndex2 = 3;
            columnIndex2 = 8;
        }
        if(count2 == 14) {
            rowIndex2 = 2;
            columnIndex2 = 8;
        }
        if(count2 == 15) {
            rowIndex2 = 1;
            columnIndex2 = 8;
        }
        if(count2 == 16) {
            rowIndex2 = 0;
            columnIndex2 = 8;
        }
        if(count2 == 17) {
            rowIndex2 = 0;
            columnIndex2 = 7;
        }
        if(count2 == 18) {
            rowIndex2 = 0;
            columnIndex2 = 6;
        }
        if(count2 == 19) {
            rowIndex2 = 0;
            columnIndex2 = 5;
        }
        if(count2 == 20) {
            rowIndex2 = 0;
            columnIndex2 = 4;
        }
        if(count2 == 21) {
            rowIndex2 = 0;
            columnIndex2 = 3;
        }
        if(count2 == 22) {
            rowIndex2 = 0;
            columnIndex2 = 2;
        }
        if(count2 == 23) {
            rowIndex2 = 0;
            columnIndex2 = 1;
        }
        if(count2 == 24) {
            rowIndex2 = 0;
            columnIndex2 = 0;
        }
        if(count2 == 25) {
            rowIndex2 = 1;
            columnIndex2 = 0;
        }
        if(count2 == 26) {
            rowIndex2 = 2;
            columnIndex2 = 0;
        }
        if(count2 == 27) {
            rowIndex2 = 3;
            columnIndex2 = 0;
        }
        if(count2 == 28) {
            rowIndex2 = 4;
            columnIndex2 = 0;
        }
        if(count2 == 29) {
            rowIndex2 = 5;
            columnIndex2 = 0;
        }
        if(count2 == 30) {
            rowIndex2 = 6;
            columnIndex2 = 0;
        }
        if(count2 == 31) {
            rowIndex2 = 7;
            columnIndex2 = 0;
        }
        GridPane.setRowIndex(p2, rowIndex2);
        GridPane.setColumnIndex(p2,columnIndex2);
    }
    public void decide() {
        int lb=1;
        boolean l1__2 = l1_2.isVisible();
        boolean l2__2 = l2_2.isVisible();
        boolean l1__3 = l1_3.isVisible();
        boolean l2__3 = l2_3.isVisible();
        boolean l1__4 = l1_4.isVisible();
        boolean l2__4 = l2_4.isVisible();
        boolean l1__5 = l1_5.isVisible();
        boolean l2__5 = l2_5.isVisible();
        boolean l1__7 = l1_7.isVisible();
        boolean l2__7 = l2_7.isVisible();
        boolean l1__9 = l1_9.isVisible();
        boolean l2__9 = l2_9.isVisible();
        boolean l1__10 = l1_10.isVisible();
        boolean l2__10 = l2_10.isVisible();
        boolean l1__11 = l1_11.isVisible();
        boolean l2__11 = l2_11.isVisible();
        boolean l1__12 = l1_12.isVisible();
        boolean l2__12 = l2_12.isVisible();
        boolean l1__13 = l1_13.isVisible();
        boolean l2__13 = l2_13.isVisible();
        boolean l1__15 = l1_15.isVisible();
        boolean l2__15 = l2_15.isVisible();
        boolean l1__18 = l1_18.isVisible();
        boolean l2__18 = l2_18.isVisible();
        boolean l1__19 = l1_19.isVisible();
        boolean l2__19 = l2_19.isVisible();
        boolean l1__20 = l1_20.isVisible();
        boolean l2__20 = l2_20.isVisible();
        boolean l1__21 = l1_21.isVisible();
        boolean l2__21 = l2_21.isVisible();
        boolean l1__23 = l1_23.isVisible();
        boolean l2__23 = l2_23.isVisible();
        boolean l1__25 = l1_25.isVisible();
        boolean l2__25 = l2_25.isVisible();
        boolean l1__27 = l1_27.isVisible();
        boolean l2__27 = l2_27.isVisible();
        boolean l1__28 = l1_28.isVisible();
        boolean l2__28 = l2_28.isVisible();
        boolean l1__29 = l1_29.isVisible();
        boolean l2__29 = l2_29.isVisible();
        boolean l1__30 = l1_30.isVisible();
        boolean l2__30 = l2_30.isVisible();
        boolean l1__31 = l1_31.isVisible();
        boolean l2__31 = l2_31.isVisible();
        if(turn % 2 == 1) {
            if(count1 == 1) {
                GridPane.setRowIndex(p1,8);
                GridPane.setColumnIndex(p1,8);
                prisonturn1 = (turn+6);
                prisonflag1 = false;
                count1=8;
            }
            if(count1 == 2) {
                if((l1__2 == false)  &&  (l2__2 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_2.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__2 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_2.setText(String.valueOf(housecount.get(count1)));
                            h_2.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__2 == true) {
                    if(l2__2==true&&l2__3==true&&l2__5==true&&l2__7==true){
                        lb=3;
                    }
                    else if ((l2__2==true&&l2__3==true&&l2__5==true)||(l2__3==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__3==true&&l2__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2)) * lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 3) {
                if((l1__3 == false)  &&  (l2__3 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_3.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__3 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_3.setText(String.valueOf(housecount.get(count1)));
                            h_3.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__3 == true) {
                    if(l2__2==true&&l2__3==true&&l2__5==true&&l2__7==true){
                        lb=3;
                    }
                    else if ((l2__2==true&&l2__3==true&&l2__5==true)||(l2__3==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__3==true&&l2__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 4) {
            	if((l1__4 == false)  &&  (l2__4 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_4.setVisible(true);
                            traincount.set(1, traincount.get(1) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l2__4 == true) {
                    money1 -= 1250 * traincount.get(2);
                    money2 += 1250 * traincount.get(2);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 5) {
                if((l1__5 == false)  &&  (l2__5 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_5.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__5 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_5.setText(String.valueOf(housecount.get(count1)));
                            h_5.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__5 == true) {
                    if(l2__2==true&&l2__3==true&&l2__5==true&&l2__7==true){
                        lb=3;
                    }
                    else if ((l2__2==true&&l2__3==true&&l2__5==true)||(l2__3==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__3==true&&l2__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 6) {
            	luck1();
            }
            if(count1 == 7) {
                if((l1__7 == false)  &&  (l2__7 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_7.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__7 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_7.setText(String.valueOf(housecount.get(count1)));
                            h_7.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__7 == true) {
                    if(l2__2==true&&l2__3==true&&l2__5==true&&l2__7==true){
                        lb=3;
                    }
                    else if ((l2__2==true&&l2__3==true&&l2__5==true)||(l2__3==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__5==true&&l2__7==true)||(l2__2==true&&l2__3==true&&l2__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 8) {

            }
            if(count1 == 9) {
                if((l1__9 == false)  &&  (l2__9 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_9.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__9 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_9.setText(String.valueOf(housecount.get(count1)));
                            h_9.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__9 == true) {
                	if(l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true){
                        lb=4;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__11==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__13==true&&l2__15==true)){
                        lb=3;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true)||(l2__9==true&&l2__10==true&&l2__13==true)||(l2__9==true&&l2__10==true&&l2__15==true)||(l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__15==true)||(l2__11==true&&l2__13==true&&l2__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 10) {
                if((l1__10 == false)  &&  (l2__10 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_10.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__10 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_10.setText(String.valueOf(housecount.get(count1)));
                            h_10.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__10 == true) {
                	if(l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true){
                        lb=4;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__11==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__13==true&&l2__15==true)){
                        lb=3;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true)||(l2__9==true&&l2__10==true&&l2__13==true)||(l2__9==true&&l2__10==true&&l2__15==true)||(l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__15==true)||(l2__11==true&&l2__13==true&&l2__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 11) {

                if((l1__11 == false)  &&  (l2__11 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_11.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__11 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_11.setText(String.valueOf(housecount.get(count1)));
                            h_11.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__11 == true) {
                	if(l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true){
                        lb=4;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__11==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__13==true&&l2__15==true)){
                        lb=3;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true)||(l2__9==true&&l2__10==true&&l2__13==true)||(l2__9==true&&l2__10==true&&l2__15==true)||(l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__15==true)||(l2__11==true&&l2__13==true&&l2__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 12) {
            	if((l1__12 == false)  &&  (l2__12 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_12.setVisible(true);
                            traincount.set(1, traincount.get(1) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l2__12 == true) {
                    money1 -= 1250 * traincount.get(2);
                    money2 += 1250 * traincount.get(2);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 13) {
                if((l1__13 == false)  &&  (l2__13 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_13.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__13 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_13.setText(String.valueOf(housecount.get(count1)));
                            h_13.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__13 == true) {
                	if(l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true){
                        lb=4;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__11==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__13==true&&l2__15==true)){
                        lb=3;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true)||(l2__9==true&&l2__10==true&&l2__13==true)||(l2__9==true&&l2__10==true&&l2__15==true)||(l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__15==true)||(l2__11==true&&l2__13==true&&l2__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 14) {
            	chance1();
            }
            if(count1 == 15) {
                if((l1__15 == false)  &&  (l2__15 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_15.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__15 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            h_15.setText(String.valueOf(housecount.get(count1)));
                            h_15.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__15 == true) {
                	if(l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true){
                        lb=4;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__11==true&&l2__13==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__11==true&&l2__15==true)||(l2__9==true&&l2__10==true&&l2__13==true&&l2__15==true)){
                        lb=3;
                    }
                    else if ((l2__9==true&&l2__10==true&&l2__11==true)||(l2__9==true&&l2__10==true&&l2__13==true)||(l2__9==true&&l2__10==true&&l2__15==true)||(l2__10==true&&l2__11==true&&l2__13==true)||(l2__10==true&&l2__11==true&&l2__15==true)||(l2__11==true&&l2__13==true&&l2__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 16) {
                
            }
            if(count1 == 17) {
                GridPane.setRowIndex(p1,0);
                GridPane.setColumnIndex(p1,0);
                hospitalturn1 = (turn+4);
                hospitalflag1 = false;
                count1=24;
            }
            if(count1 == 18) {
                if((l1__18 == false)  &&  (l2__18 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_18.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__18 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_18.setText(String.valueOf(housecount.get(count1)));
                            h_18.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__18 == true) {
                    if(l2__18==true&&l2__19==true&&l2__21==true&&l2__23==true){
                        lb=3;
                    }
                    else if ((l2__18==true&&l2__19==true&&l2__21==true)||(l2__18==true&&l2__19==true&&l2__23==true)||(l2__19==true&&l2__21==true&&l2__23==true)||(l2__18==true&&l2__21==true&&l2__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 19) {
                if((l1__19 == false)  &&  (l2__19 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_19.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__19 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_19.setText(String.valueOf(housecount.get(count1)));
                            h_19.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__19 == true) {
                    if(l2__18==true&&l2__19==true&&l2__21==true&&l2__23==true){
                        lb=3;
                    }
                    else if ((l2__18==true&&l2__19==true&&l2__21==true)||(l2__18==true&&l2__19==true&&l2__23==true)||(l2__19==true&&l2__21==true&&l2__23==true)||(l2__18==true&&l2__21==true&&l2__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 20) {
            	if((l1__20 == false)  &&  (l2__20 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_20.setVisible(true);
                            traincount.set(1, traincount.get(1) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l2__20 == true) {
                    money1 -= 1250 * traincount.get(2);
                    money2 += 1250 * traincount.get(2);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 21) {
                if((l1__21 == false)  &&  (l2__21 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_21.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__21 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_21.setText(String.valueOf(housecount.get(count1)));
                            h_21.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__21 == true) {
                    if(l2__18==true&&l2__19==true&&l2__21==true&&l2__23==true){
                        lb=3;
                    }
                    else if ((l2__18==true&&l2__19==true&&l2__21==true)||(l2__18==true&&l2__19==true&&l2__23==true)||(l2__19==true&&l2__21==true&&l2__23==true)||(l2__18==true&&l2__21==true&&l2__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 22) {
            	luck1();
            }
            if(count1 == 23) {
                if((l1__23 == false)  &&  (l2__23 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_23.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__23 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_23.setText(String.valueOf(housecount.get(count1)));
                            h_23.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__23 == true) {
                    if(l2__18==true&&l2__19==true&&l2__21==true&&l2__23==true){
                        lb=3;
                    }
                    else if ((l2__18==true&&l2__19==true&&l2__21==true)||(l2__18==true&&l2__19==true&&l2__23==true)||(l2__19==true&&l2__21==true&&l2__23==true)||(l2__18==true&&l2__21==true&&l2__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1)); m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 24) {

            }
            if(count1 == 25) {
                if((l1__25 == false)  &&  (l2__25 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_25.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__25 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_25.setText(String.valueOf(housecount.get(count1)));
                            h_25.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__25 == true) {
                    if(l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true){
                        lb=4;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__29==true&&l2__31==true)){
                        lb=3;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true)||(l2__25==true&&l2__27==true&&l2__30==true)||(l2__25==true&&l2__27==true&&l2__31==true)||(l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__31==true)||(l2__29==true&&l2__30==true&&l2__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 26) {
            	chance1();
            }
            if(count1 == 27) {
                if((l1__27 == false)  &&  (l2__27 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_27.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__27 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_27.setText(String.valueOf(housecount.get(count1)));
                            h_27.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__27 == true) {
                    if(l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true){
                        lb=4;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__29==true&&l2__31==true)){
                        lb=3;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true)||(l2__25==true&&l2__27==true&&l2__30==true)||(l2__25==true&&l2__27==true&&l2__31==true)||(l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__31==true)||(l2__29==true&&l2__30==true&&l2__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 28) {
            	if((l1__28 == false)  &&  (l2__28 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland1();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l1_28.setVisible(true);
                            traincount.set(1, traincount.get(1) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l2__28 == true) {
                    money1 -= 1250 * traincount.get(2);
                    money2 += 1250 * traincount.get(2);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 29) {
                if((l1__29 == false)  &&  (l2__29 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_29.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__29 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_29.setText(String.valueOf(housecount.get(count1)));
                            h_29.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__29 == true) {
                    if(l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true){
                        lb=4;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__29==true&&l2__31==true)){
                        lb=3;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true)||(l2__25==true&&l2__27==true&&l2__30==true)||(l2__25==true&&l2__27==true&&l2__31==true)||(l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__31==true)||(l2__29==true&&l2__30==true&&l2__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 30) {
                if((l1__30 == false)  &&  (l2__30 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_30.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__30 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_30.setText(String.valueOf(housecount.get(count1)));
                            h_30.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__30 == true) {
                    if(l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true){
                        lb=4;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__29==true&&l2__31==true)){
                        lb=3;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true)||(l2__25==true&&l2__27==true&&l2__30==true)||(l2__25==true&&l2__27==true&&l2__31==true)||(l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__31==true)||(l2__29==true&&l2__30==true&&l2__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count1 == 31) {
                if((l1__31 == false)  &&  (l2__31 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check1.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count1 - (count1 % 8)) / 8));
                    checkland1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l1_31.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__31 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build1.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count1) + 1)));
                    checkhouse1();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_31.setText(String.valueOf(housecount.get(count1)));
                            h_31.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build1.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__31 == true) {
                    if(l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true){
                        lb=4;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__29==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__30==true&&l2__31==true)||(l2__25==true&&l2__27==true&&l2__29==true&&l2__31==true)){
                        lb=3;
                    }
                    else if ((l2__25==true&&l2__27==true&&l2__29==true)||(l2__25==true&&l2__27==true&&l2__30==true)||(l2__25==true&&l2__27==true&&l2__31==true)||(l2__27==true&&l2__29==true&&l2__30==true)||(l2__27==true&&l2__29==true&&l2__31==true)||(l2__29==true&&l2__30==true&&l2__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 -= (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    money2 += (money * (1 + 0.5 * traincount.get(2))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count1) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
        }
        else {
            if(count2 == 1) {
                GridPane.setRowIndex(p2,8);
                GridPane.setColumnIndex(p2,8);
                prisonturn2= (turn+6);
                prisonflag2 =false;
                count2=8;
            }
            if(count2 == 2) {
                if((l1__2 == false) && (l2__2 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_2.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__2 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_2.setText(String.valueOf(housecount.get(count2)));
                            h_2.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__2 == true) {
                    if(l1__2==true&&l1__3==true&&l1__5==true&&l1__7==true){
                        lb=3;
                    }
                    else if ((l1__2==true&&l1__3==true&&l1__5==true)||(l1__3==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__3==true&&l1__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 3) {
                if((l1__3 == false) && (l2__3 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_3.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__3 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_3.setText(String.valueOf(housecount.get(count2)));
                            h_3.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__3 == true) {
                    if(l1__2==true&&l1__3==true&&l1__5==true&&l1__7==true){
                        lb=3;
                    }
                    else if ((l1__2==true&&l1__3==true&&l1__5==true)||(l1__3==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__3==true&&l1__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb *(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 4) {
            	if((l1__4 == false)  &&  (l2__4 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland2();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l2_4.setVisible(true);
                            traincount.set(2, traincount.get(2) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l1__4 == true) {
                    money1 += 1250 * traincount.get(1);
                    money2 -= 1250 * traincount.get(1);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 5) {
                if((l1__5 == false) && (l2__5 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_5.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__5 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_5.setText(String.valueOf(housecount.get(count2)));
                            h_5.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__5 == true) {
                    if(l1__2==true&&l1__3==true&&l1__5==true&&l1__7==true){
                        lb=3;
                    }
                    else if ((l1__2==true&&l1__3==true&&l1__5==true)||(l1__3==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__3==true&&l1__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb*(8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 6) {
            	luck2();
            }
            if(count2 == 7) {
                if((l1__7 == false) && (l2__7 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_7.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__7 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_7.setText(String.valueOf(housecount.get(count2)));
                            h_7.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__7 == true) {
                    if(l1__2==true&&l1__3==true&&l1__5==true&&l1__7==true){
                        lb=3;
                    }
                    else if ((l1__2==true&&l1__3==true&&l1__5==true)||(l1__3==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__5==true&&l1__7==true)||(l1__2==true&&l1__3==true&&l1__7==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 8) {

            }
            if(count2 == 9) {
                if((l1__9 == false) && (l2__9 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_9.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__9 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_9.setText(String.valueOf(housecount.get(count2)));
                            h_9.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__9 == true) {
                    if(l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true){
                        lb=4;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__11==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__13==true&&l1__15==true)){
                        lb=3;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true)||(l1__9==true&&l1__10==true&&l1__13==true)||(l1__9==true&&l1__10==true&&l1__15==true)||(l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__15==true)||(l1__11==true&&l1__13==true&&l1__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 10) {
                if((l1__10 == false) && (l2__10 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_10.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__10 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_10.setText(String.valueOf(housecount.get(count2)));
                            h_10.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__10 == true) {
                    if(l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true){
                        lb=4;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__11==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__13==true&&l1__15==true)){
                        lb=3;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true)||(l1__9==true&&l1__10==true&&l1__13==true)||(l1__9==true&&l1__10==true&&l1__15==true)||(l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__15==true)||(l1__11==true&&l1__13==true&&l1__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 11) {
                if((l1__11 == false) && (l2__11 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_11.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__11 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_11.setText(String.valueOf(housecount.get(count2)));
                            h_11.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__11 == true) {
                    if(l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true){
                        lb=4;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__11==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__13==true&&l1__15==true)){
                        lb=3;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true)||(l1__9==true&&l1__10==true&&l1__13==true)||(l1__9==true&&l1__10==true&&l1__15==true)||(l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__15==true)||(l1__11==true&&l1__13==true&&l1__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 12) {
            	if((l1__12 == false)  &&  (l2__12 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland2();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l2_12.setVisible(true);
                            traincount.set(2, traincount.get(2) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l1__12 == true) {
                    money1 += 1250 * traincount.get(1);
                    money2 -= 1250 * traincount.get(1);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 13) {
                if((l1__13 == false) && (l2__13 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_13.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__13 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_13.setText(String.valueOf(housecount.get(count2)));
                            h_13.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__13 == true) {
                    if(l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true){
                        lb=4;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__11==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__13==true&&l1__15==true)){
                        lb=3;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true)||(l1__9==true&&l1__10==true&&l1__13==true)||(l1__9==true&&l1__10==true&&l1__15==true)||(l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__15==true)||(l1__11==true&&l1__13==true&&l1__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))* lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))* lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 14) {
            	chance2();
            }
            if(count2 == 15) {
                if((l1__15 == false) && (l2__15 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_15.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__15 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_15.setText(String.valueOf(housecount.get(count2)));
                            h_15.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__15 == true) {
                    if(l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true){
                        lb=4;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__11==true&&l1__13==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__11==true&&l1__15==true)||(l1__9==true&&l1__10==true&&l1__13==true&&l1__15==true)){
                        lb=3;
                    }
                    else if ((l1__9==true&&l1__10==true&&l1__11==true)||(l1__9==true&&l1__10==true&&l1__13==true)||(l1__9==true&&l1__10==true&&l1__15==true)||(l1__10==true&&l1__11==true&&l1__13==true)||(l1__10==true&&l1__11==true&&l1__15==true)||(l1__11==true&&l1__13==true&&l1__15==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 16) {
                
            }
            if(count2 == 17) {
                GridPane.setRowIndex(p2,0);
                GridPane.setColumnIndex(p2,0);
                hospitalturn2 = (turn+4);
                hospitalflag2 =false;
                count2=24;
            }
            if(count2 == 18) {
                if((l1__18 == false) && (l2__18 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_18.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__18 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_18.setText(String.valueOf(housecount.get(count2)));
                            h_18.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__18 == true) {
                    if(l1__18==true&&l1__19==true&&l1__21==true&&l1__23==true){
                        lb=3;
                    }
                    else if ((l1__18==true&&l1__19==true&&l1__21==true)||(l1__18==true&&l1__19==true&&l1__23==true)||(l1__19==true&&l1__21==true&&l1__23==true)||(l1__18==true&&l1__21==true&&l1__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 19) {
                if((l1__19 == false) && (l2__19 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_19.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__19 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_19.setText(String.valueOf(housecount.get(count2)));
                            h_19.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__19 == true) {
                    if(l1__18==true&&l1__19==true&&l1__21==true&&l1__23==true){
                        lb=3;
                    }
                    else if ((l1__18==true&&l1__19==true&&l1__21==true)||(l1__18==true&&l1__19==true&&l1__23==true)||(l1__19==true&&l1__21==true&&l1__23==true)||(l1__18==true&&l1__21==true&&l1__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb * (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 20) {
            	if((l1__20 == false)  &&  (l2__20 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland2();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l2_20.setVisible(true);
                            traincount.set(2, traincount.get(2) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l1__20 == true) {
                    money1 += 1250 * traincount.get(1);
                    money2 -= 1250 * traincount.get(1);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 21) {
                if((l1__21 == false) && (l2__21 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_21.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__21 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_21.setText(String.valueOf(housecount.get(count2)));
                            h_21.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__21 == true) {
                    if(l1__18==true&&l1__19==true&&l1__21==true&&l1__23==true){
                        lb=3;
                    }
                    else if ((l1__18==true&&l1__19==true&&l1__21==true)||(l1__18==true&&l1__19==true&&l1__23==true)||(l1__19==true&&l1__21==true&&l1__23==true)||(l1__18==true&&l1__21==true&&l1__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 22) {
            	luck2();
            }
            if(count2 == 23) {
                if((l1__23 == false) && (l2__23 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_23.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__23 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_23.setText(String.valueOf(housecount.get(count2)));
                            h_23.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__23 == true) {
                    if(l1__18==true&&l1__19==true&&l1__21==true&&l1__23==true){
                        lb=3;
                    }
                    else if ((l1__18==true&&l1__19==true&&l1__21==true)||(l1__18==true&&l1__19==true&&l1__23==true)||(l1__19==true&&l1__21==true&&l1__23==true)||(l1__18==true&&l1__21==true&&l1__23==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 24) {
            	
            }
            if(count2 == 25) {
                if((l1__25 == false) && (l2__25 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_25.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__25 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_25.setText(String.valueOf(housecount.get(count2)));
                            h_25.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__25 == true) {
                    if(l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true){
                        lb=4;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__29==true&&l1__31==true)){
                        lb=3;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true)||(l1__25==true&&l1__27==true&&l1__30==true)||(l1__25==true&&l1__27==true&&l1__31==true)||(l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__31==true)||(l1__29==true&&l1__30==true&&l1__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 26) {
            	chance2();
            }
            if(count2 == 27) {
                if((l1__27 == false) && (l2__27 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_27.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__27 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_27.setText(String.valueOf(housecount.get(count2)));
                            h_27.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__27 == true) {
                    if(l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true){
                        lb=4;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__29==true&&l1__31==true)){
                        lb=3;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true)||(l1__25==true&&l1__27==true&&l1__30==true)||(l1__25==true&&l1__27==true&&l1__31==true)||(l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__31==true)||(l1__29==true&&l1__30==true&&l1__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 28) {
            	if((l1__28 == false)  &&  (l2__28 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: 2500");
                    checkland2();
                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{

                        if(YorN.getSelectedToggle() == Y) {
                            l2_28.setVisible(true);
                            traincount.set(2, traincount.get(2) + 1);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }           
                if(l1__28 == true) {
                    money1 += 1250 * traincount.get(1);
                    money2 -= 1250 * traincount.get(1);
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 29) {
                if((l1__29 == false) && (l2__29 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_29.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__29 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_29.setText(String.valueOf(housecount.get(count2)));
                            h_29.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__29 == true) {
                    if(l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true){
                        lb=4;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__29==true&&l1__31==true)){
                        lb=3;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true)||(l1__25==true&&l1__27==true&&l1__30==true)||(l1__25==true&&l1__27==true&&l1__31==true)||(l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__31==true)||(l1__29==true&&l1__30==true&&l1__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 30) {
                if((l1__30 == false) && (l2__30 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_30.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__30 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_30.setText(String.valueOf(housecount.get(count2)));
                            h_30.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__30 == true) {
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
            if(count2 == 31) { ;
                if((l1__31 == false) && (l2__31 == false)) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    check2.setVisible(true);
                    buy.setText("cost: " + (money * (8 + count2 - (count2 % 8)) / 8));
                    checkland2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            l2_31.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        check2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l2__31 == true) {
                    buy.setVisible(true);
                    Y.setVisible(true);
                    N.setVisible(true);
                    build2.setVisible(true);
                    buy.setText("cost: " + (housemoney * (housecount.get(count2) + 1)));
                    checkhouse2();

                    Timeline decision = new Timeline(new KeyFrame(Duration.millis(10000),(e)->{
                        if(YorN.getSelectedToggle() == Y) {
                            h_31.setText(String.valueOf(housecount.get(count2)));
                            h_31.setVisible(true);
                        }
                        Y.setSelected(false);
                        N.setSelected(false);
                        buy.setVisible(false);
                        Y.setVisible(false);
                        N.setVisible(false);
                        build2.setVisible(false);
                    }));
                    decision.play();
                }
                if(l1__31 == true) {
                    if(l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true){
                        lb=4;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__29==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__30==true&&l1__31==true)||(l1__25==true&&l1__27==true&&l1__29==true&&l1__31==true)){
                        lb=3;
                    }
                    else if ((l1__25==true&&l1__27==true&&l1__29==true)||(l1__25==true&&l1__27==true&&l1__30==true)||(l1__25==true&&l1__27==true&&l1__31==true)||(l1__27==true&&l1__29==true&&l1__30==true)||(l1__27==true&&l1__29==true&&l1__31==true)||(l1__29==true&&l1__30==true&&l1__31==true)){
                        lb=2;
                    }
                    else {
                        lb=1;
                    }
                    money1 += (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    money2 -= (money * (1 + 0.5 * traincount.get(1))*lb* (8 + count1 - (count1 % 8)) / 16 * (housecount.get(count2) + 1));
                    m1.setText(String.valueOf(money1));
                    m2.setText(String.valueOf(money2));
                }
            }
        }
    }
    public void checkland1() {
        if(YorN.getSelectedToggle() == Y) {
        	if(count1 % 8 == 4 ) {
        		money1 -= 2500;
        	}
        	else {
        		money1 -= (money * (8 + count1 - (count1 % 8)) / 8);
        	}          
            buy.setVisible(false);
            Y.setVisible(false);
            N.setVisible(false);
            check1.setVisible(false);
            m1.setText(String.valueOf(money1));
        }
    }

    public void checkland2() {
        if(YorN.getSelectedToggle() == Y) {
        	if(count2 % 8 == 4 ) {
        		money2 -= 2500;
        	}
        	else {
        		money2 -= (money * (8 + count2 - (count2 % 8)) / 8);
        	}
            buy.setVisible(false);
            Y.setVisible(false);
            N.setVisible(false);
            check2.setVisible(false);
            m2.setText(String.valueOf(money2));
        }
    }

    public void checkhouse1() {
        if(YorN.getSelectedToggle() == Y) {
            money1 -= (housemoney * (housecount.get(count1) + 1));
            housecount.set(count1, housecount.get(count1) + 1);
            buy.setVisible(false);
            Y.setVisible(false);
            N.setVisible(false);
            build1.setVisible(false);
            m1.setText(String.valueOf(money1));
        }
    }

    public void checkhouse2() {
        if(YorN.getSelectedToggle() == Y) {
            money2 -= (housemoney * (housecount.get(count2) + 1));
            housecount.set(count2, housecount.get(count2) + 1);
            buy.setVisible(false);
            Y.setVisible(false);
            N.setVisible(false);
            build2.setVisible(false);
            m2.setText(String.valueOf(money2));
        }
    }
    
    public void chance1() {
    	int decide = (int)(Math.random()*100 + 1);
    	num.setText(String.valueOf(decide));
    	if(decide <= 40) {
    		money1 += 100 * (decide);
    		money2 -= 100 * (decide);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 80) {
    		money1 -= 100 * (decide - 40);
    		money2 += 100 * (decide - 40);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 89) {
    		money1 *= 2;
    		 m1.setText(String.valueOf(money1));
             m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 98) {
    		money1 /= 2;
    		 m1.setText(String.valueOf(money1));
             m2.setText(String.valueOf(money2));
    	}
    	else if(decide == 99) {
    		money2 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else {
    		money1 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    }
    public void luck1() {
    	int decide = (int)(Math.random()*100 + 1);
    	num.setText(String.valueOf(decide));
    	if(decide <= 40){
    		money1 -= 100 * (decide);
    		money2 += 100 * (decide);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 80){
    		money1 += 100 * (decide - 40);
    		money2 -= 100 * (decide - 40);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 98) {
    		money1 = 50000;
    		money2 = 50000;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide == 99) {
    		money2 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else {
    		money1 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    }
    public void chance2() {
    	int decide = (int)(Math.random()*100 + 1);
    	num.setText(String.valueOf(decide));
    	if(decide <= 40) {
    		money1 -= 100 * (decide);
    		money2 += 100 * (decide);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 80) {
    		money1 += 100 * (decide - 40);
    		money2 -= 100 * (decide - 40);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 89) {
    		money2 *= 2;
    		 m1.setText(String.valueOf(money1));
             m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 98){
    		money2 /= 2;
    		 m1.setText(String.valueOf(money1));
             m2.setText(String.valueOf(money2));
    	}
    	else if(decide == 99) {
    		money1 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else {
    		money2 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    }
    public void luck2() {
    	int decide = (int)(Math.random()*100 + 1);
    	num.setText(String.valueOf(decide));
    	if(decide <= 40){
    		money1 += 100 * decide;
    		money2 -= 100 * decide;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 80){
    		money1 -= 100 * (decide - 40);
    		money2 += 100 * (decide - 40);
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide <= 98) {
    		money1 = 50000;
    		money2 = 50000;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else if(decide == 99) {
    		money1 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    	else {
    		money2 = 0;
    		m1.setText(String.valueOf(money1));
            m2.setText(String.valueOf(money2));
    	}
    }
}