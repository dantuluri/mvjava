public void init(){
        System.out.println("init()");

        BufferedImageLoader loader = new BufferedImageLoader();

        System.out.println("**************");
        System.out.println("File names:");
        File file = new File(".");
        for(String fileNames : file.list()) System.out.println(fileNames);
        System.out.println("**************");

        System.out.println("Trying to load image...");

        try{
            spriteSheet = loader.loadImage("res/spritesheet.png");
        }catch(IOException e){
        }
        System.out.println("Image loaded!");

        SpriteSheet ss = new SpriteSheet(spriteSheet);
        player = ss.grabImage(1,1,32,32);
    }
