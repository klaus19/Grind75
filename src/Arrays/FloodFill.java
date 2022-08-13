package Arrays;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
            if (image[sr][sc]==newcolor){
                return image;
            }

            fill(image,sr,sc,image[sr][sc],newcolor);
            return image;
    }

    public void fill (int[][] image, int sr, int sc, int color,int newColor){

        if ( sr<0||sc<0||sr>=image.length||sc>=image[0].length||image[sr][sc]!=color){

            return;
        }
        image[sr][sc] = newColor;
        fill(image,sr-1,sc,color,newColor);
        fill(image,sr+1,sc,color,newColor);
        fill(image,sr,sc-1,color,newColor);
        fill(image,sr,sc+1,color,newColor);

    }
}
