
function verificaMusica(){
var mus=formulario.musica.value;
if(mus=='indie'){
	divs.className='indie';
	divs.innerHTML="<h1>Indie</h1><img src='indie.jpg'/><audio src='Avicii - Hey Brother.wav'></audio> ";
    /* tive a ideia de colocar musicas entao criei uma variavel chamando ela por um 
    queryselector que chama o audio em seguida adianto o tempo e ja inicio ela quando
    a pessoa seleciona o estilo. fiz uma classe em cada para distinguir os audios   */
    var indie = document.querySelector('audio.indie')
    indie.currentTime = 60
    indie.play()

}else if(mus=='rock'){
	divs.className='rock';
	divs.innerHTML="<h1>Rock</h1><img src='Rock.png'/>";
    var rock=document.querySelector("audio.rock")
    rock.currentTime = 60
    rock.play()

}else if(mus=='trap'){
	divs.className='trap';
	divs.innerHTML="<h1>Trap</h1><img src='trap.jpg'/>";
    var trap=document.querySelector('audio.trap')
    trap.currentTime = 60
    trap.play()
    
}else if(mus=='sertanejo'){
    
	divs.className='sertanejo';
	divs.innerHTML="<h1>Sertanejo</h1><img src='sertanejo.jpg'/>";
    var sertanejo=document.querySelector('audio.sertanejo')
    sertanejo.currentTime = 40
    sertanejo.play()
    
}else{
	divs.className='eletronica';
	divs.innerHTML="<h1>Eletronica</h1><img src='eletronica.jpg'/>";
    var eletro=document.querySelector('audio.eletro')
    eletro.currentTime = 40
    eletro.play()
    	
}
}

