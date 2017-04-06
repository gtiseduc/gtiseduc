/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*Função Pai de Mascaras*/
function mascara(o,f){
       v_obj=o
       v_fun=f
       setTimeout("execmascara()",1)
}

 /*Função que Executa os objetos*/
function execmascara(){
    v_obj.value=v_fun(v_obj.value)
}

/*Função que retorna só numeros*/
function sonumeros(v){
        return v.replace(/\D/g,"")
}

/*Função que padroniza telefone (81) 8888-8888*/
function mascaraTelefone(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito                
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2") 
    v=v.replace(/(\d{4})(\d)/,"$1-$2")    
    return v
}

/*Função que padroniza telefone (81) 88888888*/
function TelefoneCall(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito                    
    v=v.replace(/^(\d\d)(\d)/g,"($1) $2")    
    return v
}
    
/*Função que padroniza CPF*/
function Cpf(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
    v=v.replace(/(\d{3})(\d)/,"$1.$2")       
    v=v.replace(/(\d{3})(\d)/,"$1.$2")       

    v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2") 
    return v
}

/*Função que padroniza CEP*/
function Cep(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
    v=v.replace(/D/g,"")                
    v=v.replace(/^(\d{5})(\d)/,"$1-$2") 
    return v
}

/*Função que padroniza CNPJ*/
function Cnpj(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito                   
    v=v.replace(/^(\d{2})(\d)/,"$1.$2")     
    v=v.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3") 
    v=v.replace(/\.(\d{3})(\d)/,".$1/$2")           
    v=v.replace(/(\d{4})(\d)/,"$1-$2")              
    return v
}

/*Função que padroniza DATA*/
function Data(v){
    v=v.replace(/\D/g,"") 
    v=v.replace(/(\d{2})(\d)/,"$1/$2") 
    v=v.replace(/(\d{2})(\d)/,"$1/$2") 
    return v
}

/*Função que padroniza Hora*/
function Hora(v){
    v=v.replace(/\D/g,"") 
    v=v.replace(/(\d{2})(\d)/,"$1:$2")  
    return v
}

/*Função que padroniza valor monétario*/
function Valor(v){
    v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
    v=v.replace(/^([0-9]{3}\.?){3}-[0-9]{2}$/,"$1.$2");
    //v=v.replace(/(\d{3})(\d)/g,"$1,$2")
    v=v.replace(/(\d)(\d{2})$/,"$1.$2") //Coloca ponto antes dos 2 últimos digitos
    return v
}