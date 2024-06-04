/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kampus;

import java.util.List;

/**
 *
 * @author En Tay
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        
        user.id="1222";
        user.tipe="DOSEN";
        user.status = "AKTIF";
        if(user.tambah()) {
            System.out.println("TAMBAH OK");
        } else {
            System.out.println("GAGAL:"+user.getErrMsg());
        }
        
        System.out.println("=======================");
        List<User> daftar = User.getList();
        for(User row: daftar){
            System.out.println(row.id);
        }
    }
}
