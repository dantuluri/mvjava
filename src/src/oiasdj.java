class Quiz extends JPanel implements ActionListener

  {

    private String inFileName, line, fullQuestion, fullTextFile,qNumber, choiceA, choiceB, choiceC, choiceD, fullQuestion2;
    private Scanner input;
    private String[]QuizQs;
    private int randomQuestion,x1,x2, x3;
    private boolean ca1, ca2, ca3, ca4, sp, a1select, a2select, a3select, a4select, correct, wrong;
    private JButton submit, next2;
    private ButtonGroup answers;
    private JRadioButton a1, a2, a3, a4;
    private JTextArea question, treatCountDisplay;
    private Font f, smallf, mediumf;
    private UnlockTraitsPanel utp;


    public Quiz()
    {

      setLayout(null);
      setBackground(mainBlue);

      question = new JTextArea();
      // question.setLineWrap(true);
      // question.setSize(530, 70);
      // question.setLocation(30, 50); some text area
      // question.setFont(smallf);
      // question.setBackground(mainBlue);

      add(question);

      treatCountDisplay = new JTextArea();
      treatCountDisplay.setLineWrap(true);
      treatCountDisplay.setSize(100, 100);
      treatCountDisplay.setLocation(500, 0);
      treatCountDisplay.setFont(smallf);
      treatCountDisplay.setOpaque(false);

      //treatCountDisplay.setBackground(mainBlue);

      add(treatCountDisplay);


      submit = new JButton("Submit");
      submit.setFont(mediumf);
      submit.setText("Submit");
      submit.setSize(100, 50);
      submit.setLocation(300,500);
      submit.addActionListener(this);

      add(submit);

      next2 = new JButton("Next");
      next2.setFont(mediumf);
      next2.setText("Next");
      next2.setSize(100, 50);
      next2.setLocation(400,500);
      next2.addActionListener(this);

      add(next2);

      answers = new ButtonGroup();			//adding a buttongroup
      a1 = new JRadioButton();
      a2 = new JRadioButton();
      a3 = new JRadioButton();
      a4 = new JRadioButton();


      answers.add(a1);						//adding buttons to a buttongroup
      answers.add(a2);
      answers.add(a3);
      answers.add(a4);

      a1.addActionListener(this);				//setting all attributes to the buttons
      a2.addActionListener(this);
      a3.addActionListener(this);
      a4.addActionListener(this);

      a1.setSize(600,40);
      a2.setSize(600,40);
      a3.setSize(600,40);
      a4.setSize(600,40);

      a1.setLocation(30, 130);
      a2.setLocation(30, 230);
      a3.setLocation(30, 330);
      a4.setLocation(30, 430);

      a1.setFont(smallf);
      a2.setFont(smallf);
      a3.setFont(smallf);
      a4.setFont(smallf);

      a1.setBackground(mainBlue);
      a2.setBackground(mainBlue);
      a3.setBackground(mainBlue);
      a4.setBackground(mainBlue);


      add(a1);
      add(a2);
      add(a3);
      add(a4);

      ca1 = false;								//initializing all booleans as false/ they are eventually true when the buttons are clicked
      ca2 = false;
      ca3 = false;
      ca4 = false;
      sp = false;
      a1select = false;
      a2select = false;
      a3select = false;
      a4select = false;

      correct = false;
      wrong = false;

      inFileName = "QuizQuestions.txt";
      line = "";
      fullQuestion = "";
      QuizQs = new String[30];


      randomQuestion = (int)((Math.random()*29)+1);		//randomizing an integer when the user clicks submit in the question
      getTextFile();
      getText();
      setVariables();
      setQuestion();
      displayRadioButtons();

    }
    public void getTextFile() 								//method is just for making sure that the textFile for the quiz questions can be found
    {
      File inFile = new File(inFileName);
      try
      {
        input = new Scanner(inFile);

      }
      catch (FileNotFoundException e)
      {
        System.out.println("Error. Cannot Find/Open File " + inFileName );
        System.exit(1);

      }
    }


    public void getText()									//method from reading input from the tutorial.txt file so we c an print the stuff from the tutorial.txt file on to the JTextArea
    {

      while(input.hasNext())
      {
        line = input.nextLine();

        fullTextFile = fullTextFile + "\n" + line;		//creating a string to add to the textArea
      }

      for(x1=0;x1<29;x1++)
      {

        fullQuestion = fullTextFile.substring(0, fullTextFile.indexOf("---")+3)	;		//this separates the big string that is the textFile of quiz questions into individual questions
        fullTextFile = fullTextFile.substring(fullQuestion.length()+4);					//resets the big string of the text file as the text file minus the string that was just read
        QuizQs[x1] = fullQuestion;														//adds question to a value on the array
      }
      //System.out.print(fullQuestion);					//setting the text to what is in the tutorial.txt file
    }
    public void setVariables()								//this method is only fully excecuted if the random number generated is the loop integer value
    {														/*when the random integer value has arrived then it separates the text file into choices ABCD to
                                  to set the text to the radiobuttons*/


      for (x3 = 0; x3<29 ; x3++)
      {
        fullQuestion2 = QuizQs[x3];
        if(fullQuestion2.equals(""))
        {
          fullQuestion2 = QuizQs[x3 +1];
        }
        if (x3 == randomQuestion)
        {
          qNumber = fullQuestion2.substring((fullQuestion2.indexOf(">") +1), (fullQuestion2.indexOf("<")));
          fullQuestion2 = fullQuestion2.substring(qNumber.length() + 3);


          choiceA = fullQuestion2.substring(fullQuestion2.indexOf("a)")+2, fullQuestion2.indexOf("b)"));
          fullQuestion2 = fullQuestion2.substring(choiceA.length()+2);


          choiceB = fullQuestion2.substring(fullQuestion2.indexOf("b)")+2, fullQuestion2.indexOf("c)"));
          fullQuestion2 = fullQuestion2.substring(choiceB.length()+2);//choiceB = fullQuestion.substring(beginIndex, endIndex)

          choiceC = fullQuestion2.substring(fullQuestion2.indexOf("c)")+2, fullQuestion2.indexOf("d)"));
          fullQuestion2 = fullQuestion2.substring(choiceC.length() +2);//choiceB = fullQuestion2.substring(beginIndex, endIndex)


          choiceD = fullQuestion2.substring(fullQuestion2.indexOf("d)")+2, fullQuestion2.indexOf("---"));
          fullQuestion2 = fullQuestion2.substring(choiceD.length()+4);//choiceB = fullQuestion.substring(beginIndex, endIndex)

          QuizQs[x3] = "";
          if (choiceA.indexOf("!") == 0) 	//this if else block is to determine which one of the answers is correct, in the text file the correct answer has an ! in the front
          {								// boolean for each answer choice is set as true w respective correct answers
          //System.out.print(choiceA);
          ca1 = true;
          choiceA = choiceA.substring(1);
          }

          else if (choiceB.indexOf("!") == 0)
          {
          //System.out.print(choiceB);
          ca2 = true;
          choiceB = choiceB.substring(1);
          }

          else if (choiceC.indexOf("!") == 0)
          {
          //System.out.print(choiceC);
          ca3 = true;
          choiceC = choiceC.substring(1);
          }

          else if (choiceD.indexOf("!") == 0)
          {
          //System.out.print(choiceD);
          ca4 = true;
          choiceD = choiceD.substring(1);

          }

        }

      }
    }
    public void setQuestion()
    {
      question.setText(qNumber);

    }
    public void displayRadioButtons()
    {
      a1.setFont(smallf);
      a2.setFont(smallf);
      a3.setFont(smallf);
      a4.setFont(smallf);

      a1.setText(choiceA);
      a2.setText(choiceB);
      a3.setText(choiceC);
      a4.setText(choiceD);


    }
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
