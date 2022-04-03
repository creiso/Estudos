
function calculaPreco(){
var numero= formulario.num.value;
if (numero <= 0 ){
    divs.innerHTML="<h1>Insira um Valor valido</h1>"
    numero=1
    
}
var mus=formulario.produto.value;
if(mus=='placa'){
	divs.className='placa';
    
    var pla= 1499.00;
    var pla= numero*pla;
	divs.innerHTML="<h1>Placa de Video</h1><img src='placa.png'/> Para "+numero+" unidades de 1.499,00 sai por apenas R$"+pla+",00";
    
    
 

}else if(mus=='memoria'){
    
	divs.className='memoria';
    var memo= 349;
    var memo= numero*memo;
	divs.innerHTML="<h1>Memoria ram</h1><img src='memo.png'/> Para "+numero+" unidades 349,00 sai por apenas R$"+memo+",00";
    
}else if(mus=='ssd'){
	divs.className='ssd';
    var memo= 437;
    var memo= numero*memo;
	divs.innerHTML="<h1>SSD</h1><img src='ssd.png'/> Para "+numero+" unidades 437,00 sai por apenas R$"+memo+",00";
   
    
}else if(mus=='teclado'){
    
	divs.className='teclado';
    var memo= 399;
    var memo= numero*memo;
	divs.innerHTML="<h1>Teclados</h1><img src='tec.png'/> Para "+numero+" unidades de 399,00 sai por apenas R$"+memo+",00";
    
    
}else if(mus=='monitor'){
	divs.className='monitor';
    var memo= 859;
    var memo= numero*memo;
	divs.innerHTML="<h1>Monitores</h1><img src='moni.png'/> Para "+numero+ " unidades de 859,00 sai por apenas R$"+memo+",00";
    
    	
}
}

