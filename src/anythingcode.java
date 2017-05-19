private int x;
            private String[] organName;
            private String[] picString;
            private int[] organNumber;
            private String[] system;
            private JPanel test;

            public PracticePanel()
            {
                x = 0;

                organName = new String[]{"Pancreas", "Kidney", "Trachea", "Heart", "Spleen", "Larynx", "Small Intestine", "Gallbladder", "Stomach", "Large Intestine", "Thyroid", "Thymus", "Pericardium", "Rectum", "Greater Omentum", "Urogential Opening", "Liver", "Diaphragm", "Lung", "Anus"};
                picString = new String [] {"pancreas.jpg", "kidney.jpg", "trachea.jpg", "heart.jpg", "spleen.jpg", "larynx.jpg", "smallIntestine.jpg", "gallbladder.jpg", "stomach.jpg", "largeIntestine.jpg", "thyroid.jpg", "thymus.jpg", "pericardium.jpg", "rectum.jpg", "greaterOmentum.jpg", "urogenitalOpening.jpg", "liver.jpg", "diaphragm.jpg", "lung.jpg", "anus.jpg"};
                organNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
                system = new String[]{"Digestive", "Excretory", "Respiratory"};

                setSize(500, 500);
                setLayout(new GridLayout(1,1));

                OrganPanel o = new OrganPanel();
                add(o);
            }

            class OrganPanel extends JPanel implements ActionListener
            {
            public JLabel name;
                public JRadioButton mc1;
                public JRadioButton mc2;
                public JRadioButton mc3;
                public JRadioButton mc4;

                public JTextField answer;

                public OrganPanel()
                {
                    setSize(500, 500);
                    setLayout(new GridLayout(5, 3));

                    InnerPanel ip = new InnerPanel();
                    add(ip);

                    InnerPanel3 up = new InnerPanel3();
                    up.run();
                    up.repaint();
                    add(up);

                    InnerPanel1 ip1 = new InnerPanel1();
                    add(ip1);

                    answer = new JTextField("System Name", 10000);
                    add(answer);

                    InnerPanel2 ip2 = new InnerPanel2();
                    add(ip2);
                }

                public void actionPerformed(ActionEvent e)
                {

                }

                public void paintComponent(Graphics g)
                {

                }

                class InnerPanel extends JPanel
                {

                //InnerPanel(){}
                public InnerPanel()
                {
                name = new JLabel(organName[x], JLabel.CENTER);
                        name.setForeground(Color.RED);
                        name.setFont(new Font("Serif", Font.PLAIN, 75));
                        add(name);
                }
                }

                class InnerPanel1 extends JPanel implements ActionListener
                {
                    public InnerPanel1()
                    {
                        ButtonGroup bg = new ButtonGroup();

                        setLayout(new GridLayout(2, 2));

                        mc1 = new JRadioButton("Answer 1");
                        mc2 = new JRadioButton("Answer 2");
                        mc3 = new JRadioButton("Answer 3");
                        mc4 = new JRadioButton("Answer 4");

                        bg.add(mc1);
                        bg.add(mc2);
                        bg.add(mc3);
                        bg.add(mc4);

                        add(mc1);
                        add(mc2);
                        add(mc3);
                        add(mc4);
                    }

                    public void actionPerformed(ActionEvent e)
                    {

                    }
                }

                class InnerPanel2 extends JPanel implements ActionListener
                {
                        public JButton next1;
                        public InnerPanel2()
                        {
                            setLayout(new BorderLayout());
                            next1 = new JButton("next");
                            next1.addActionListener(this);
                            add(next1, BorderLayout.EAST);
                        }

                        public void actionPerformed(ActionEvent e)
                        {
                        if(x<19)
                        x++;
                        name.setText(organName[x]);
                        }
                }

                class InnerPanel3 extends JPanel
                {
                    private Image image;
                    private String imageName;

                    public InnerPanel3()
                    {
                        imageName = "Test.jpg";
                    }

                    public void run()
                    {
                        getMyImage();
                    }

                    public void getMyImage()
                    {
                        try
                        {
                            image = ImageIO.read(new File(imageName));
                        }
                        catch(IOException e)
                        {
                            System.err.println("\n\n" + imageName + " can't be found.");
                            e.printStackTrace();
                        }
                    }

                    public void paintComponent(Graphics g)
                    {
                        g.drawImage(image, 10, 10, 50, 50, this);
                    }
                }
            }
