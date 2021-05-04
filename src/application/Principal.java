package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal extends Application {
	public Integer[] vet1 = new Integer[10]; // vetor primeiro numero
	public Integer[] vet2 = new Integer[10]; // vetor segundo numero
	public Integer[] vetDec = new Integer[10]; // vetor das decimais
	static int j = 1; // multiplicador decimais
	public double v1; // numero 1
	public double v2; // numero 2
	public double dec; // decimal 
	static double resFinal; // resultado final
	public char op = 'x'; // opcoes sinal
	public char varAtual = 'x'; // qual numero esta

	public void start(Stage stg) {
		GridPane pane = new GridPane();
		HBox telaCima = new HBox();

		TextField resp = new TextField("0");
		Button butCE = new Button("CE");
		Button but1 = new Button("1");
		Button but2 = new Button("2");
		Button but3 = new Button("3");
		Button but4 = new Button("4");
		Button but5 = new Button("5");
		Button but6 = new Button("6");
		Button but7 = new Button("7");
		Button but8 = new Button("8");
		Button but9 = new Button("9");
		Button but0 = new Button("0");
		Button butMais = new Button("+");
		Button butMenos = new Button("-");
		Button butIgual = new Button("=");
		Button butDiv = new Button("/");
		Button butMult = new Button("*");
		Button butVirg = new Button(",");

		pane.add(but1, 0, 1);
		pane.add(but2, 1, 1);
		pane.add(but3, 2, 1);
		pane.add(butMais, 3, 1);
		pane.add(but4, 0, 2);
		pane.add(but5, 1, 2);
		pane.add(but6, 2, 2);
		pane.add(butMenos, 3, 2);
		pane.add(but7, 0, 3);
		pane.add(but8, 1, 3);
		pane.add(but9, 2, 3);
		pane.add(butMult, 3, 3);
		pane.add(butVirg, 0, 4);
		pane.add(but0, 1, 4);
		pane.add(butIgual, 2, 4);
		pane.add(butDiv, 3, 4);
		pane.setPrefSize(5.0, 5.0);
		pane.setHgap(5.0);
		pane.setVgap(5.0);
		resp.setMaxWidth(80.0);
		resp.setEditable(false);
		telaCima.setSpacing(5.0);
		telaCima.getChildren().addAll(resp, butCE);

		VBox pPane = new VBox(5.0);
		pPane.getChildren().addAll(telaCima, pane);
		Scene scn = new Scene(pPane);

		but1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 1);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 1);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 1);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 1);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 1);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 1);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 1);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 1);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 1);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 1);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 2);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 2);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 2);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 2);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 2);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 2);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 2);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 2);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 2);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 2);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 3);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 3);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 3);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 3);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 3);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 3);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 3);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 3);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 3);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 3);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 4);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 4);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 4);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 4);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 4);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 4);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 4);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 4);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 4);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 4);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 5);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 5);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 5);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 5);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 5);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 5);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 5);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 5);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 5);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 5);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 6);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 6);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 6);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 6);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 6);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 6);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 6);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 6);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 6);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 6);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 7);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 7);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 7);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 7);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 7);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 7);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 7);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 7);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 7);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 7);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 8);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 8);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 8);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 8);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 8);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 8);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 8);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 8);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 8);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 8);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 9);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 9);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 9);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 9);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 9);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 9);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 9);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 9);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 9);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 9);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		but0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				dec = 0;
				if (varAtual == 'x') {
					v1 = numeroTela(vet1, 0);
					resp.setText(v1 + "");
				} else if (varAtual == ',') {
					dec = numeroTela(vetDec, 0);
					v1 = v1 + (dec / j);
					resp.setText("" + v1);
				}
				if (op == '+') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 0);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 0);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 + v2;
				} else if (op == '-') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 0);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 0);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 - v2;
				} else if (op == '*') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 0);
						resp.setText(v2 + "");
					} else if (varAtual == ';') {
						dec = numeroTela(vetDec, 0);
						v2 = v2 + (dec / j);
						resp.setText("" + v2);
					}
					resFinal = v1 * v2;
				} else if (op == '/') {
					if (varAtual == 'y') {
						v2 = numeroTela(vet2, 0);
						resp.setText(v2 + "");
					} else if (op == ',') {
						dec = numeroTela(vetDec, 0);
						v2 = v2 + (dec / j);
						resp.setText("" + v1);
					}
					resFinal = v1 / v2;
				}
				arg0.consume();
			}
		});
		butMais.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '+';
				varAtual = 'y';
				resp.setText("");
			}
		});
		butMenos.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '-';
				varAtual = 'y';
				resp.setText("");
			}
		});
		butDiv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '/';
				varAtual = 'y';
				resp.setText("");
			}
		});
		butMult.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '*';
				varAtual = 'y';
				resp.setText("");
			}
		});
		butVirg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					varAtual = ',';
				} else {
					varAtual = ';';
				}
			}
		});
		butIgual.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				resp.setText("R: "+resFinal);
			}
		});
		butCE.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				v1 = 0;
				v2 = 0;
				op = 'x';
				varAtual = 'x';
				for(int i = 0;i<10;i++) {
					vet1[i] = null;
					vet2[i] = null;
					vetDec[i] = null;
				}
				resp.setText("0");
			}
		});
		stg.setResizable(false);
		stg.setScene(scn);
		stg.show();

	}

	public static void main(String[] args) {
		Application.launch(Principal.class, args);
	}

	public static double numeroTela(Integer vet[], int numBotao) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] == null) {
				vet[i] = numBotao;
				break;
			}
		}
		j = 1;
		double x = 0;
		for (int i = 9; i >= 0; i--) {
			if (vet[i] != null) {
				while (i >= 0) {
					if (i == 0) {
						x += (vet[i] * j);
						j *= 10;
						break;
					} else {
						x += (vet[i] * j);
						j *= 10;
						i--;
					}
				}
			}
		}
		double res = x;
		return res;
	}
}
