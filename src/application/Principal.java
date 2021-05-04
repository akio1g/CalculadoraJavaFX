package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {
	public Integer[] vet = new Integer[10];
	public Integer[] vetDec = new Integer[10];
	public double x = 0;
	public double dec;
	public double y = 0;
	public double res = 0;
	public char op = 'x';

	class Manipulador implements EventHandler<MouseEvent> {

		@Override
		public void handle(MouseEvent e) {
			System.out.println("Teste");
			x += 1;
			e.consume();
		}

	}

	public void start(Stage stg) {
		GridPane pane = new GridPane();
		GridPane gPane = new GridPane();
		Scene scn = new Scene(gPane);

		Label resp = new Label("0");
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

		resp.setMaxSize(65, 80);
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

		gPane.add(resp, 0, 0);
		gPane.add(butCE, 1, 0);
		gPane.add(pane, 0, 1);

		but1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 1;
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 1;
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 2; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 2; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 3; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 3; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 4; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 4; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 5; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 5; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 6; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 6; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 7; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 7; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 8; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 8; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but9.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 9; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 9; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		but0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				if (op == 'x') {
					for (int i = 0; i < vet.length; i++) {
						if (vet[i] == null) {
							vet[i] = 0; // trocar
							break;
						}
					}
					int j = 1;
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
					res = x;
					resp.setText(x + "");
					x = 0;
				} else if (op == ',') {
					for (int i = 0; i < vetDec.length; i++) {
						if (vetDec[i] == null) {
							vetDec[i] = 0; // trocar
							break;
						}
					}
					int j = 1;
					for (int i = 9; i >= 0; i--) {
						if (vetDec[i] != null) {
							while (i >= 0) {
								if (i == 0) {
									dec += (vetDec[i] * j);
									j *= 10;
									break;
								} else {
									dec += (vetDec[i] * j);
									j *= 10;
									i--;
								}
							}
						}
					}

					resp.setText("" + (res + (dec / j)));
					dec = 0;
				} else if (op == '+') {
					res = y + x;
				} else if (op == '-') {
					res = y - x;
				} else if (op == '*') {
					res = y * x;
				} else if (op == '/') {
					res = y / x;
				}
				arg0.consume();
			}
		});
		butMais.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '+';
				y = x;
				resp.setText("" + x);
			}
		});
		butMenos.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '-';
				y = x;
				resp.setText("" + x);
			}
		});
		butDiv.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '/';
				y = x;
				resp.setText("" + x);
			}
		});
		butMult.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = '*';
				y = x;
				resp.setText("" + x);
			}
		});
		butVirg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent arg0) {
				op = ',';
				y = x;
			}
		});
		stg.setScene(scn);
		stg.setTitle("Calculator");
		stg.show();

	}

	public static void main(String[] args) {
		Application.launch(Principal.class, args);
	}

}
