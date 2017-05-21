public void actionPerformed(ActionEvent e){

				if(a1.isSelected())					//if else block for if a radiobutton is selected, respecitve booleans are set as true and others are set as false
				{
					a1select = true;
					a2select = false;
					a3select = false;
					a4select = false;
				}


				else if(a2.isSelected())
				{
					a2select = true;
					a1select = false;
					a3select = false;
					a4select = false;
				}

				else if(a3.isSelected())
				{
					a3select = true;
					a1select = false;
					a2select = false;
					a4select = false;

				}
				else if(a4.isSelected())
				{
					a4select = true;
					a1select = false;
					a2select = false;
					a3select = false;

				}
				String command = e.getActionCommand();
				if(command.equals("Submit"))			//tells the computer to go to changeQuestions when submit is pressed
				{
					sp = true;
					changeQuestions();

				}
				else if(command.equals("Next"))//&& correctCount >=6 )
				{

					System.out.print("/n + haha" + individual2);
					tntPanel2.getCards().show(tntPanel2, "Show Dog");

				}




			}
			public void changeQuestions()					//method that changes the text of the radiobuttons if the user answers correctly
			{

				//System.out.println();
				if(sp == true &&  a1select == true && ca1 == true)
				{

					sp = false;
					a1select = false;
					ca1 = false;
					correct = true;
				}
				else if(sp == true &&  a2select == true && ca2 == true)
				{

					correct = true;
					sp = false;
					a2select = false;
					ca2 = false;
				}
				else if(sp == true &&  a3select == true && ca3 == true)
				{

					correct = true;
					sp = false;
					a3select = false;
					ca3 = false;
				}
				else if(sp == true &&  a4select == true && ca4 == true)
				{

					correct = true;
					sp = false;
					a4select = false;
					ca4 = false;
				}
				else
				{
					correct = false;
					wrong = true;
				}

				if (correct == true)
				{
					randomQuestion = (int)((Math.random()*29)+1);	//randomizes integer for the next question

					getTextFile();
					setVariables();
					setQuestion();
					displayRadioButtons();
					correctCount++;
					treatCount = treatCount + 3;
					treatCountDisplay.setText("Treat Count \n" + treatCount);
					getter();

					//System.out.println("correct");
				}
				else if (wrong == true)
				{
					treatCount = treatCount - 1;
					treatCountDisplay.setText("Treat Count \n" + treatCount);
					//System.out.println("wrong");

				}



			}
