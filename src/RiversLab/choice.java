package RiversLab;

public class choice {
    public choice(Byte id){
        switch (id){
            case 1:{
                this.obj = 1;
                this.display = "Rock";
                break;
            }
            case 2:{
                this.obj = 2;
                this.display = "Paper";
                break;
            }
            case 3: {
                this.obj = 3;
                this.display = "Scissors";
                break;
            }
            default: {
                this.obj = (byte) ((Math.random() * 3) + 1);
                switch (this.obj){
                    case 1:{
                        this.display = "Rock";
                        break;
                    }
                    case 2: {
                        this.display = "Paper";
                        break;
                    }
                    case 3: this.display = "Scissors"; break;
                }
            }
        }
    }
    public String display;
    public byte obj;
}
