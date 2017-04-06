function getEndereco() {    
    var cep = $.trim($("#cep").val());
    if(cep != "" && cep.length == 9){
        $("#aguardaCEP").show();
        $("#spanCEP").html("    Buscando CEP...");
        $.getScript("http://cep.republicavirtual.com.br/web_cep.php?formato=javascript&cep="+cep, function(){
            if(resultadoCEP["resultado"] == 1){
                    $("#logradouro").val(unescape(resultadoCEP["tipo_logradouro"])+": "+unescape(resultadoCEP["logradouro"]));
                    $("#bairro").val(unescape(resultadoCEP["bairro"]));
                    $("#cidade").val(unescape(resultadoCEP["cidade"]));
                    $("#uf").val(unescape(resultadoCEP["uf"]));
                    $("#aguardaCEP").hide();                    
            }
        });		
        setTimeout(function(){$("#aguardaCEP").hide();},8000);
    }			            
}