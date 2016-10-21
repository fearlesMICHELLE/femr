# --- !Ups

ALTER TABLE `patients`
ADD COLUMN `isApproximateAge` VARCHAR(255) NULL DEFAULT NULL AFTER `age`;

# --- !Downs