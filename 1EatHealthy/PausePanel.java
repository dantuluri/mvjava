public class PausePanel extends JPanel implements ActionListener
		
			private JButton quitButton,resumeButton;
			public PausePanel()
			{
				quitButton = new JButton("quit");
				quitButton.addActionListener(this);
				add(quitButton);

				resumeButton = new JButton("resume");
				resumeButton.addActionListener(this);
				add(resumeButton);

				JLabel degRadLabel = new JLabel("Units");
				add(degRadLabel);

				ButtonGroup degRad  = new ButtonGroup();

				JRadioButton degrees = new JRadioButton("Degrees");
				degrees.addActionListener(this);
				add(degrees);
				degRad.add(degrees);

				JRadioButton radians = new JRadioButton("Radians");
				radians.addActionListener(this);
				add(radians);
				degRad.add(radians);

				JRadioButton randUnits = new JRadioButton("Random");
				randUnits.addActionListener(this);
				add(randUnits);
				degRad.add(randUnits);
			}
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
			}
			public void actionPerformed(ActionEvent e)
			{
				String str = e.getActionCommand();
				if(str.equals("resume"))
				{
					gameCards.show(gh,"GamePanel");
					gameTimer.start();

				} //resumes game

				else if(str.equals("quit"))
				{
					gameCards.show(gh,"GamePanel");
					generateObstacles();
					score = 0;
		       		charx = 50;
		       		chary = 500;
		       		scorex = 50;
		       		yvel = 0;
		       		framesPassed = 0;

		       		scrollVelocity = permScrollVelocity;
		       		flight = -1;
		       		invincibility = -1;
		       		imageName = "character.png";

					cards.show(holder,"HomePanel");
				} //goes back to HomePanel
				// set the angles array to be used in generating questions
			// as degrees or radians
				else if(str.equals("Degrees"))
				{
					for(int i = 0;i < angles.length;i++)
						angles[i] = degrees[i];
				}
				else if(str.equals("Radians"))
				{
					for(int i = 0;i < angles.length;i++)
						angles[i] = radians[i];
				}
				else if(str.equals("Random"))
				{
					int choose = 0;
					for(int i = 0;i < angles.length;i++)
					{
						choose = (int)(Math.random()*2+0);
						if(choose == 0)
							angles[i] = radians[i];
						else
							angles[i] = degrees[i];
					}
				}
			}
		}
