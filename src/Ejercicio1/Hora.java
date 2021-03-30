package Ejercicio1;

public class Hora
{
    private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;

    public Hora (int hora , int minuto , int segundo ){
        if( hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60 ) {
            // Si un parametro ingresado no respeta la condicion todos seran 0
            this.hora = hora ;
            this.minuto = minuto ;
            this.segundo = segundo ;
        }
    }

    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundo() { return segundo; }

    public void setHora(int hora)
    {
        if(hora >= 0 && hora < 24)
            this.hora = hora;
        else if (hora == 24) // Si aumento la hora a 24 se pondra a 0
            this.hora = 0;
        else if (hora == -1) // Si disminuyo la hora a -1 se pondra a 23
            this.hora = 23;
    }
    public void setMinuto( int minuto )
    {
       if (minuto >= 0 && minuto < 60)
           this.minuto = minuto;
       else if ( minuto == 60 )
           this.minuto = 0 ;
       else if ( minuto == -1 )
           this.minuto = 59 ;
    }
    public void setSegundo(int segundo)
    {
       if (segundo >= 0 && segundo < 60)
           this.segundo = segundo;
       else if ( segundo == 60 )
           this.segundo = 0 ;
       else if ( segundo == -1 )
           this.segundo = 59 ;
    }

    public Hora avanceReloj()
    {
        int auxSeg = this.segundo + 1 ;
        this.setSegundo( ( auxSeg ) );

        int auxMin = ( this.minuto + 1 );
        if( auxSeg == 60 )
            this.setMinuto( auxMin );

        if( auxMin == 60 )
            this.setHora( this.hora + 1 );

        return this;
    }

    public Hora atrasaReloj()
    {
        int auxSeg = this.segundo - 1 ;
        this.setSegundo( ( auxSeg ) );

        if( auxSeg == -1 )
        {
            int auxMin = ( this.minuto - 1 );
            this.setMinuto( auxMin );

            if( auxMin == -1 )
                this.setHora( this.hora - 1 );
        }

        return this ;
    }

    public String imprimeHora()
    {
        String auxHora = String.valueOf(this.getHora()); // Paso los enteros a String
        String auxMinuto =  String.valueOf(this.getMinuto());
        String auxSegundo = String.valueOf(this.getSegundo());

        if(hora < 10) // Si la hora es menor a 10 que el String tenga un 0
            auxHora = "0"+auxHora;
        if(minuto < 10)
            auxMinuto = "0"+auxMinuto;
        if (segundo < 10)
            auxSegundo = "0"+auxSegundo;

        return auxHora+" : "+auxMinuto+" : "+auxSegundo ; //Retorno los strings
    }

}
