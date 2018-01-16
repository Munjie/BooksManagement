 function  addbook(){

     var temp = $('#fom').serialize();
     var bookname  = $('#bookName').val();
     var author = $('#author').val();
     var buyTime = $('#buyTime').val();

     if (bookname == null || "" == bookname){
         alert("图书名称不能为空")
         return false;
     }
     if (author == null || "" == author){
         alert("作者不能为空")
         return false;
     }


     $.post("addbook.do",temp,function (data) {

         var  t = eval('('+data+')');
         alert(t.msg);

     });

 }

