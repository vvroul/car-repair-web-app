// jQuery(function ($) {
//
//     function validateUserCreate() {
//         $('#create-user').validate({
//             rules: {
//                 specialId: {
//                     required: true,
//                     minlength: 9,
//                     maxlength: 9,
//                     digits: true
//                 },
//                 firstName: {
//                     required: true
//                 },
//                 lastName: {
//                     required: true
//                 },
//                 address: {
//                     required: true
//                 },
//                 password: {
//                     required: true
//                 },
//                 username: {
//                     required: true
//                 },
//                 user_role: {
//                     required: true
//                 },
//                 email: {
//                     required: true,
//                     email: true
//                 }
//             },
//             messages: {
//                 specialId: {
//                     required: 'Please enter your ID',
//                     minlength: 'ID should be more than 9 digits',
//                     maxlength: 'ID should be more than 9 digits',
//                     digits: 'ID should contain only digits'
//                 }
//             }
//         });
//     }
//
//     validateUserCreate();
//
//     if($('input#dateListing')) {
//         $('input#dateListing').datepicker({
//             format: 'dd/mm/yyyy'
//         });
//     }
//
//     $('#search').submit(function(e)){
//          e.preventDefault();
//
//          $.ajax({
//              url: '/search',
//              method: 'GET',
//              data: $('#search').serialize()
//          }).done(function (response) {
//          }).fail(function () {
//
//          });
//
//
//     }
//
//
//
//     if ($('.button-delete-confirmation')) {
//
//         $('.button-delete-confirmation').click(function (e) {
//
//             $('#dialog-delete-confirmation').dialog({
//                 autoOpen: false,
//                 modal: true
//             });
//         });
//     }
//
// });
