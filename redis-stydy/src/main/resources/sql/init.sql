-- DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user`
(
    `id`                  bigint(20) NOT NULL AUTO_INCREMENT,
    `name`                varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci  DEFAULT NULL COMMENT '用户名',
    PRIMARY KEY(`id`) USING BTREE,
    INDEX `idx_name`(`name`) USING BTREE
    ) ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;