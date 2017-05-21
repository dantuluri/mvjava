boolean[] keys = new boolean[4];
final int A = 0;
final int D = 1;
final int W = 2;
final int S = 3;

void setup() {

}

void draw() {

 if (keys[D]) {
   // do something;
 }
if (keys[A]) {
   // do something;
 }
if (keys[W]) {
   // do something;
 }
if (keys[S]) {
   // do something;
 }

} // end of draw()


void keyPressed() {
   int mybutton = key;  // the ascii value of the key that was pushed

     switch (mybutton) {
      case 101:
        keys[D] = true;
        break;
      case 97:
        keys[A] = true;
        break;
      case 44:
        keys[W] = true;
        break;
      case 111:
        keys[S] = true;
        break;
    } // end switch

} // end keyPressed

void keyReleased() {
switch (mybutton) {
      case 101:
        keys[D] = false;
        break;
      case 97:
        keys[A] = false;
        break;
      case 44:
        keys[W] = false;
        break;
      case 111:
        keys[S] = false;
        break;
    } // end switch

} // end keyReleased
